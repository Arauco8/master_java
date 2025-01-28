package org.caupolican.pooclasesabstractas.form.validador;

public class NumberValidator extends Validator {

    protected String message = "El campo debe ser un número"; // importante que este definido como en la clase padre

    @Override
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    @Override
    public boolean isValid(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
