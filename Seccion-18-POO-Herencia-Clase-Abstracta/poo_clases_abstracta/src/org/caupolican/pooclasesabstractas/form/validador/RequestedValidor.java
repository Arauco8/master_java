package org.caupolican.pooclasesabstractas.form.validador;

public class RequestedValidor extends Validator {

    protected String message = "El campo %s es requerido";

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
        return value != null && !value.isEmpty();
    }
}
