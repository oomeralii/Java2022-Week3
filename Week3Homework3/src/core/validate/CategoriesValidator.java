package core.validate;

import entities.Categories;

public class CategoriesValidator {

    Categories[] category;

    public void CategoriesValidator(Categories[] category) {
        this.category = category;
    }

    public boolean İsValid(Categories categories) throws Exception {
        for (Categories category : category) {
            if (category.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Bu kategori ismi daha önce kullanılmıştır.");
            }
        }

        return true;
    }
}

