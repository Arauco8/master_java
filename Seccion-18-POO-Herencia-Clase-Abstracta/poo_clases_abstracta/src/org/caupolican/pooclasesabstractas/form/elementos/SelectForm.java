package org.caupolican.pooclasesabstractas.form.elementos;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<String> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<String>();
    }

    public SelectForm(String name, List<String> options) {
        super(name);
        this.options = options;
    }

    @Override
    public String dibujarHtml() {
        return "";
    }
}
