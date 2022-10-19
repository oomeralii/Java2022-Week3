package business;

import core.logging.Logger;
import core.validate.CoursesValidator;
import dataAccess.CoursesDao;
import entities.Courses;

public class CoursesManager {
        CoursesDao coursesDao;
        CoursesValidator coursesValidator;
        Logger[] loggers;

        public CoursesManager(CoursesDao coursesDao, CoursesValidator coursesValidator, Logger[] loggers){
            this.coursesDao=coursesDao;
            this.coursesValidator=coursesValidator;
            this.loggers=loggers;
        }

        public void add(Courses courses) throws Exception{

            if(coursesValidator.İsValid(courses)){
                this.coursesDao.add(courses);
                System.out.println("Yeni kategori eklendi: " +courses.getCourseName());

                for(Logger logger : loggers){
                    logger.log(courses.getCourseName());
                }
            }
        }

        public void delete(Courses courses) throws Exception{

            if(coursesValidator.İsValid(courses)){
                this.coursesDao.add(courses);
                System.out.println("Kategori silindi: " +courses.getCourseName());

                for(Logger logger : loggers){
                    logger.log(courses.getCourseName());
                }
            }
            else{
                System.out.println("kategori bulunamadı: " +courses.getCourseName());
            }
        }

        public void uptate(Courses courses) throws Exception{

            if(coursesValidator.İsValid(courses)){
                this.coursesDao.add(courses);
                System.out.println("Kategori güncelendi: " +courses.getCourseName());

                for(Logger logger : loggers){
                    logger.log(courses.getCourseName());
                }
            }
            else{
                System.out.println("kategori bulunamadı: " +courses.getCourseName());
            }
        }

}


