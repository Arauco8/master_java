package org.comarca.interfaces.imprenta.modelo;

public interface Imprimible {

    String TEXTO_POR_DEFECTO = "Imprimiendo valor por defecto..."; //por defecto es public static final
    /*default String imprimir(){//metodo por defecto, solo cuando el metodo sea opcional, cuando sea necesario una implementacion por defecto
        return "Imprimiendo valor por defecto...";
    } //los metodos de una interfaz son publicos o default*/

    String imprimir();
    static void imprimirVacio(){
        System.out.println(TEXTO_POR_DEFECTO);
    }


}
