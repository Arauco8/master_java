package org.caupolican.pooclasesabstractas.form.elementos;

public class TextAreaForm extends ElementoForm{

    private int row;
    private int col;

    public TextAreaForm(String name) {
        super(name);
    }

    public TextAreaForm(String name, int row, int col) {
        super(name);
        this.row = row;
        this.col = col;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    @Override
    public String dibujarHtml() {
        return "<textarea name='" + this.name
                + "' rows='" + this.row
                + "' cols='" + this.col
                + "'>" + this.value
                + "</textarea>";
    }
}
