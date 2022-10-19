package dataAccess;

import entities.Courses;

public class HibernateCoursesDao implements CoursesDao {
    @Override
    public void add(Courses courses) {
        System.out.println("Hibernate ile veri tabanına eklendi :" +courses.getCourseName());
    }

    @Override
    public void delete(Courses courses) {
        System.out.println("Hibernate ile veri tabanından silindi :" +courses.getCourseName());
    }

    @Override
    public void update(Courses courses) {
        System.out.println("Hibernate ile güncellendi :" +courses.getCourseName());
    }
}
