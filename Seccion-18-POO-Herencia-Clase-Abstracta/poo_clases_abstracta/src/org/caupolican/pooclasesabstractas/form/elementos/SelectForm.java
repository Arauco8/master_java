package org.caupolican.pooclasesabstractas.form.elementos;

import org.caupolican.pooclasesabstractas.form.elementos.select.Option;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Option> options;

    public SelectForm(String name) {
        super(name);
        this.options = new ArrayList<Option>();
    }

    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

   public SelectForm addOption(Option option) {
        this.options.add(option);
        return this; // Return the object itself
    }

    @Override
    public String dibujarHtml() {
        StringBuilder html = new StringBuilder("<select");
        html.append(" name='")
                .append(this.name)
                .append("'>");
        for (Option option : options) {
            html.append("\n<option value='")
                    .append(option.getValue())
                    .append("'");
            if (option.getSelected()) {
                html.append(" selected");
                this.value = option.getValue();
            }
            html.append(">")
                    .append(option.getName())
                    .append("</option>");
        }
        html.append("\n</select>");
        return html.toString();
    }
}
