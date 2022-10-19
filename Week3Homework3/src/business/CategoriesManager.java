package business;

import core.logging.Logger;
import core.validate.CategoriesValidator;
import dataAccess.CategoriesDao;
import entities.Categories;

public class CategoriesManager{
    CategoriesDao categoriesDao;
    CategoriesValidator categoriesValidator;
    Logger[] loggers;

    public CategoriesManager(CategoriesDao categoriesDao, CategoriesValidator categoriesValidator, Logger[] loggers){
        this.categoriesDao=categoriesDao;
        this.categoriesValidator=categoriesValidator;
        this.loggers=loggers;
    }

    public void add(Categories categories) throws Exception{

        if(categoriesValidator.İsValid(categories)){
            this.categoriesDao.add(categories);
            System.out.println("Yeni kategori eklendi: " +categories.getCategoryName());

            for(Logger logger : loggers){
                logger.log(categories.getCategoryName());
            }
        }
    }

    public void delete(Categories categories) throws Exception{

        if(categoriesValidator.İsValid(categories)){
            this.categoriesDao.add(categories);
            System.out.println("Kategori silindi: " +categories.getCategoryName());

            for(Logger logger : loggers){
                logger.log(categories.getCategoryName());
            }
        }
        else{
            System.out.println("kategori bulunamadı: " +categories.getCategoryName());
        }
    }

    public void uptate(Categories categories) throws Exception{

        if(categoriesValidator.İsValid(categories)){
            this.categoriesDao.add(categories);
            System.out.println("Kategori güncelendi: " +categories.getCategoryName());

            for(Logger logger : loggers){
                logger.log(categories.getCategoryName());
            }
        }
        else{
            System.out.println("kategori bulunamadı: " +categories.getCategoryName());
        }
    }

}
