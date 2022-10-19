package business;

import core.logging.Logger;
import core.validate.EducatorsValidator;
import dataAccess.EducatorsDao;
import entities.Educators;

public class EducatorsManager {
    EducatorsDao educatorsDao;
    EducatorsValidator educatorsValidator;
    Logger[] loggers;

    public EducatorsManager(EducatorsDao educatorsDao, EducatorsValidator educatorsValidator, Logger[] loggers){
        this.educatorsDao=educatorsDao;
        this.educatorsValidator=educatorsValidator;
        this.loggers=loggers;
    }

    public void add(Educators educators) throws Exception{

        if(educatorsValidator.İsvalid(educators)){
            this.educatorsDao.add(educators);
            System.out.println("Yeni eğitmen eklendi: " +educators.getEducaterName());

            for(Logger logger : loggers){
                logger.log(educators.getEducaterName());
            }
        }
    }

    public void delete(Educators educators) throws Exception{

        if(educatorsValidator.İsvalid(educators)){
            this.educatorsDao.add(educators);
            System.out.println("Eğitmen silindi: " +educators.getEducaterName());

            for(Logger logger : loggers){
                logger.log(educators.getEducaterName());
            }
        }
        else{
            System.out.println("eğitmen bulunamadı: " + educators.getEducaterName());
        }
    }

    public void uptate(Educators educators) throws Exception{

        if(educatorsValidator.İsvalid(educators)){
            this.educatorsDao.add(educators);
            System.out.println("Kategori güncelendi: " + educators.getEducaterName());

            for(Logger logger : loggers){
                logger.log(educators.getEducaterName());
            }
        }
        else{
            System.out.println("Eğitmen bulunamadı: " + educators.getEducaterName());
        }
    }

}

