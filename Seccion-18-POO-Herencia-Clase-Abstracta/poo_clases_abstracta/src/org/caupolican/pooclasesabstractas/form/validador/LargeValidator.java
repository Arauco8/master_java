package org.caupolican.pooclasesabstractas.form.validador;

import org.caupolican.pooclasesabstractas.form.validador.message.IMessageFormateable;

public class LargeValidator extends Validator implements IMessageFormateable {

    protected String message = "El campo %s debe tener minímo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MAX_VALUE;

    public LargeValidator() {
    }

    public LargeValidator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        //this.message = String.format(this.message, this.min, this.max);
        if (value == null) {
            return true;
        }
        int length = value.length();
        return length >= this.min && length <= this.max;
    }

    @Override
    public String getMessageFormatted(String field) {
        return this.message = String.format(this.message, field, this.min, this.max);
    }

    /*public String getMessageFormatted(String field) {
        return this.message = String.format(this.message, field, this.min, this.max);
    }*/
}
