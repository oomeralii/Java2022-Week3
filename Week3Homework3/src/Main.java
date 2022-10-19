import business.CategoriesManager;
import business.CoursesManager;
import business.EducatorsManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import core.validate.CategoriesValidator;
import core.validate.CoursesValidator;
import dataAccess.HibernateCoursesDao;
import dataAccess.HibernateEducatorsDao;
import dataAccess.JdbcCategoriesDao;
import entities.Categories;
import entities.Courses;
import entities.Educators;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Categories categories1 = new Categories(1,"yazılım");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

        CategoriesManager categoriesManager = new CategoriesManager(new JdbcCategoriesDao(), new CategoriesValidator(),loggers);
        categoriesManager.add(categories1);

        for (Logger logger : loggers) {
            logger.log(categories1.getCategoryName());
        }


    }
}


