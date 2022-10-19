package dataAccess;

import entities.Courses;

public class JdbcCoursesDao implements CoursesDao{
    @Override
    public void add(Courses courses) {
        System.out.println("JDBC ile veri tabanına eklendi :" +courses.getCourseName());
    }

    @Override
    public void delete(Courses courses) {
        System.out.println("JDBC ile veri tabanından silindi :" +courses.getCourseName());
    }

    @Override
    public void update(Courses courses) {
        System.out.println("JDBC ile güncellendi :" +courses.getCourseName());
    }
}
