package org.caupolican.pooclasesabstractas.form.elementos;

import org.caupolican.pooclasesabstractas.form.validador.Validator;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String value; // Protected field porque la clase hija pueda utilizar estos atributos, sin necesidad de implementar el metodo get
    protected String name; // Protected field

    private List<Validator> validators; // Private field
    private List<String> errors; // Private field

    public ElementoForm() {
        this.validators = new ArrayList<>(); // Initialize the validators list
        this.errors = new ArrayList<>();// Initialize the errors list
    }

    public ElementoForm(String name) {
        this(); // Call the constructor of the same class
        this.name = name;
    }

    public ElementoForm addValidator(Validator validator) {
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isValid() {
        this.errors.clear(); // Clear the errors list
        for (Validator validator : validators) {
            if (!validator.isValid(this.value)) {
                this.errors.add(validator.getMessage());
            }
        }
        return this.errors.isEmpty();
    }

    abstract public String dibujarHtml(); // Abstract method

}
