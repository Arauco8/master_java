package org.comarca.interfaces.imprenta;

import org.comarca.interfaces.imprenta.modelo.Curriculum;
import org.comarca.interfaces.imprenta.modelo.Hoja;
import org.comarca.interfaces.imprenta.modelo.Informe;

public class Main {
    public static void main(String[] args) {

        Curriculum curriculum = new Curriculum("Caupolican", "Informática", "Estudios en la Universidad de la Vida")
                .addExperiencia("Programador en Java")
                .addExperiencia("Programador en Python")
                .addExperiencia("Programador en C++");

        Informe informe = new Informe("Caupolican", "Colo Colo", "Informe de la reunión de ayer");

        imprimir(curriculum);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {
        System.out.println(imprimible.imprimir());
    }
}