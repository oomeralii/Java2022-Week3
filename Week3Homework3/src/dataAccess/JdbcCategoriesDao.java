package dataAccess;

import entities.Categories;
public class JdbcCategoriesDao implements CategoriesDao {

    @Override
    public void add(Categories categories) {
        System.out.println("JDBC ile veri tabanına eklendi :" +categories.getCategoryName());
    }

    @Override
    public void delete(Categories categories) {
        System.out.println("JDBC ile veri tabanından silindi :" +categories.getCategoryName());
    }

    @Override
    public void update(Categories categories) {
        System.out.println("JDBC ile güncellendi :" +categories.getCategoryName());
    }
}
