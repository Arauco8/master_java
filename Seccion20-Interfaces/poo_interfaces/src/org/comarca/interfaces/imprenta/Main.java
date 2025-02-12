package org.comarca.interfaces.imprenta;

import org.comarca.interfaces.imprenta.modelo.*;

public class Main {
    public static void main(String[] args) {


        Persona persona = new Persona("Caupolican", "Colo Colo", "12345678Z");

        Curriculum curriculum = new Curriculum(persona, "Informática", "Estudios en la Universidad de la Vida")
                .addExperiencia("Programador en Java")
                .addExperiencia("Programador en Python")
                .addExperiencia("Programador en C++");

        Libro libro = new Libro(persona, "Miguel de Cervantes", Genero.DRAMA);
        libro.addPagina(new Pagina("En un lugar de la Mancha, de cuyo nombre no quiero acordarme"))
            .addPagina(new Pagina("no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero"))
            .addPagina(new Pagina("adarga antigua, rocín flaco y galgo corredor"));

        Informe informe = new Informe(persona, "Colo Colo", "Informe de la reunión de ayer");

        imprimir(curriculum);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}