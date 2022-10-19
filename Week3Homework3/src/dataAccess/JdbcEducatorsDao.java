package dataAccess;

import entities.Educators;

public class JdbcEducatorsDao implements EducatorsDao {
    @Override
    public void add(Educators educators) {
        System.out.println("JDBC ile veri tabanına eklendi :" +educators.getEducaterName());
    }

    @Override
    public void delete(Educators educators) {
        System.out.println("JDBC ile veri tabanından silindi :" +educators.getEducaterName());
    }

    @Override
    public void update(Educators educators) {
        System.out.println("JDBC ile güncellendi :" +educators.getEducaterName());
    }
}
