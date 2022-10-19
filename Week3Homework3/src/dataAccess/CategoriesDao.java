package dataAccess;

import entities.Categories;

public interface CategoriesDao {
    void add(Categories categories);
    void delete(Categories categories);
    void update(Categories categories);
}
