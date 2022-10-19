package dataAccess;

import entities.Courses;

public interface CoursesDao {
    void add(Courses courses);
    void delete(Courses courses);
    void update(Courses courses);
}
