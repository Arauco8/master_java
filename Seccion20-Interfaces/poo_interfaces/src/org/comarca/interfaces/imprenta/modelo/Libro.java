package org.comarca.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;//lo dejamos al tipo mas generico posible por eso de Hoja a Imprimible
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro de ");
        sb.append(autor);
        sb.append(":\n");
        sb.append(" Genero ");
        sb.append(genero);
        sb.append(":\n");
        sb.append(" titulado ");
        sb.append(titulo);
        sb.append(":\n");
        for (Imprimible pagina : paginas) {
            sb.append(pagina.imprimir());
            sb.append("\n");
        }
        return sb.toString();
    }
}
