package dataAccess;

import entities.Educators;

public interface EducatorsDao {
    void add(Educators educators);
    void delete(Educators educators);
    void update(Educators educators);
}
