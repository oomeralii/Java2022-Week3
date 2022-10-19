package dataAccess;

import entities.Educators;

public class HibernateEducatorsDao implements EducatorsDao {
    @Override
    public void add(Educators educators) {
        System.out.println("Hibernate ile veri tabanına eklendi :" +educators.getEducaterName());
    }

    @Override
    public void delete(Educators educators) {
        System.out.println("Hibernate ile veri tabanından silindi :" +educators.getEducaterName());
    }

    @Override
    public void update(Educators educators) {
        System.out.println("Hibernate ile güncellendi :" +educators.getEducaterName());
    }
}
