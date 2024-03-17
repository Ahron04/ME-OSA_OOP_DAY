
package Meñosa_labact2.newpackage;


public class PrintTextEditor extends TextEditor {

    public PrintTextEditor(String text) {
        super(text);
    }

    public void print() {
        System.out.println(getText());
    }
}