package org.caupolican.pooclasesabstractas.form;

import org.caupolican.pooclasesabstractas.form.elementos.ElementoForm;
import org.caupolican.pooclasesabstractas.form.elementos.InputForm;
import org.caupolican.pooclasesabstractas.form.elementos.SelectForm;
import org.caupolican.pooclasesabstractas.form.elementos.TextAreaForm;
import org.caupolican.pooclasesabstractas.form.elementos.select.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        language.addOption(java)
        .addOption(new Option("2", "Python"))
        .addOption(new Option("3", "JavaScript"))
        .addOption(new Option("4", "TypeScript"))
        .addOption(new Option("5", "Goland").setSelected(true));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='" +this.name+ "' value=\"" +this.value+ "\">";
            }
        };

        saludar.setValue("Hola que tal este campo esta deshabilitado");
        username.setValue("john.doe");
        password.setValue("123456");
        email.setValue("johndoe@correo.com");
        edad.setValue("25");
        telefono.setValue("12345678");
        url.setValue("http://www.johndoe.com");
        fecha.setValue("2021-09-01");
        experience.setValue("... mas de 10 de experiencia en Java ...");
        comments.setValue("... comentarios ...");
        //java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                telefono,
                url,
                fecha,
                experience,
                comments,
                language,
                saludar);

        elementos.forEach(elementoForm -> {
            System.out.println(elementoForm.dibujarHtml());
            System.out.println("<br>");
        });

    }
}