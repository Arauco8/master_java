package org.caupolican.pooclasesabstractas.form;

import org.caupolican.pooclasesabstractas.form.elementos.ElementoForm;
import org.caupolican.pooclasesabstractas.form.elementos.InputForm;
import org.caupolican.pooclasesabstractas.form.elementos.SelectForm;
import org.caupolican.pooclasesabstractas.form.elementos.TextAreaForm;
import org.caupolican.pooclasesabstractas.form.elementos.select.Option;
import org.caupolican.pooclasesabstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidator(new RequestedValidor());

        InputForm password = new InputForm("password", "password");
        password.addValidator(new RequestedValidor())
                    .addValidator(new LargeValidator(6,12));

        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequestedValidor())
                .addValidator(new EmailValidator());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidator(new NumberValidator());

        InputForm telefono = new InputForm("telefono", "tel");
        telefono.addValidator(new LargeValidator(8, 8))
                .addValidator(new NumberValidator());

        InputForm url = new InputForm("url", "url");
        url.addValidator(new RequestedValidor());

        InputForm fecha = new InputForm("fecha", "date");
        fecha.addValidator(new RequestedValidor());

        TextAreaForm experience = new TextAreaForm("exp", 5, 9);
        experience.addValidator(new NotNullValidator());

        TextAreaForm comments = new TextAreaForm("comentarios", 3, 10);
        comments.addValidator(new RequestedValidor());

        SelectForm language = new SelectForm("language");
        language.addValidator(new NotNullValidator());

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
        username.setValue("johndoe");
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

        elementos.forEach(elementoForm -> {
            if (!elementoForm.isValid()) {
                elementoForm.getErrors().forEach(err -> System.out.println(elementoForm.getName() + ": " + err));
            }
        });

    }
}