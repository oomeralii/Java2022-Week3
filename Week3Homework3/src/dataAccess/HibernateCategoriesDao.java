package dataAccess;

import entities.Categories;

public class HibernateCategoriesDao implements CategoriesDao {


    @Override
    public void add(Categories categories) {
        System.out.println("Hibernate ile veritabanına eklendi : " +categories.getCategoryName());
    }

    @Override
    public void delete(Categories categories) {
        System.out.println("Hibernate ile veritabanından silindi :" +categories.getCategoryName());
    }

    @Override
    public void update(Categories categories) {
        System.out.println("Hibernate ile güncellendi :" +categories.getCategoryName());
    }
}
