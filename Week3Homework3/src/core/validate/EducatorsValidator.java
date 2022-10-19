package core.validate;

import entities.Educators;

public class EducatorsValidator {

    Educators[] educator;

    public void EducatorsValidator(Educators[] educator) {
        this.educator = educator;
    }

    public boolean İsvalid(Educators educators) throws Exception {
        for (Educators educator : educator) {
            if (educator.getEducaterName() == educator.getEducaterName()) {
                throw new Exception("Bu eğitmen ismi daha önce kullanılmıştır.");
            }
        }

        return true;
    }
}

