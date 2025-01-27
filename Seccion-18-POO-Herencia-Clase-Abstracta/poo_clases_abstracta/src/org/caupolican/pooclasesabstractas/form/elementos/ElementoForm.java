package org.caupolican.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor; // Protected field porque la clase hija pueda utilizar estos atributos, sin necesidad de implementar el metodo get
    protected String nombre; // Protected field

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this(); // Call the constructor of the same class
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml(); // Abstract method

}
