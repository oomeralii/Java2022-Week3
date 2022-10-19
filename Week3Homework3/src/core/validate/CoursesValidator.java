package core.validate;

import entities.Courses;

public class CoursesValidator {

    Courses[] cours;

    public void CoursesValidator(Courses[] cours) {
        this.cours = cours;
    }

    public boolean İsValid(Courses courses) throws Exception {
        for (Courses cours : cours) {
            if (cours.getCourseName() == cours.getCourseName()) {
                throw new Exception("Bu kurs ismi daha önce kullanılmıştır.");
            }
        }
        if(courses.getPrice() < 0) {
            throw new Exception("Kurs fiyatı 0' dan küçük olamaz");
        }
        return true;
    }
}

