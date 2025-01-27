package org.caupolican.pooclasesabstractas.form;

import org.caupolican.pooclasesabstractas.form.elementos.ElementoForm;
import org.caupolican.pooclasesabstractas.form.elementos.InputForm;
import org.caupolican.pooclasesabstractas.form.elementos.SelectForm;
import org.caupolican.pooclasesabstractas.form.elementos.TextAreaForm;
import org.caupolican.pooclasesabstractas.form.elementos.select.Option;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("password", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad = new InputForm("edad", "number");
        InputForm telefono = new InputForm("telefono", "tel");
        InputForm url = new InputForm("url", "url");
        InputForm fecha = new InputForm("fecha", "date");

        TextAreaForm experience = new TextAreaForm("exp", 5, 9);
        TextAreaForm comments = new TextAreaForm("comentarios", 3, 10);

        SelectForm language = new SelectForm("language");
        Option java = new Option("1", "Java");
        language.addOption(java);
        language.addOption(new Option("2", "Python"));
        language.addOption(new Option("3", "JavaScript"));
        language.addOption(new Option("4", "TypeScript"));
        language.addOption(new Option("5", "Goland"));

        username.setValue("john.doe");
        password.setValue("123456");
        email.setValue("johndoe@correo.com");
        edad.setValue("25");
        java.setSelected(true);

    }
}