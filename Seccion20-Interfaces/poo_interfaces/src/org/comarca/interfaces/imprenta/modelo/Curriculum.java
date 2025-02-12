package org.comarca.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;
    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia) {
        experiencias.add(experiencia);
        return this; // Devolvemos this para poder encadenar el metodo
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curriculum de ");
        sb.append(persona);
        sb.append(" en ");
        sb.append(carrera);
        sb.append(":\n");
        for (String experiencia : experiencias) {
            sb.append(" - ");
            sb.append(experiencia);
            sb.append("\n");
        }
        sb.append(this.contenido);
        return sb.toString();
    }
}
