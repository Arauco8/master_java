package org.caupolican.pooclasesabstractas.form.elementos;

abstract public class ElementoForm {

    protected String value; // Protected field porque la clase hija pueda utilizar estos atributos, sin necesidad de implementar el metodo get
    protected String name; // Protected field

    public ElementoForm() {
    }

    public ElementoForm(String name) {
        this(); // Call the constructor of the same class
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    abstract public String dibujarHtml(); // Abstract method

}
