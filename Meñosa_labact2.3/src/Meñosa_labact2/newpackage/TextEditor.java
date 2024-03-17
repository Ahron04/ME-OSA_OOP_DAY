package Meñosa_labact2.newpackage;

public class TextEditor {
    String text;

    public TextEditor() {
    }
    
    
    public TextEditor(String initialText) {
        this.text = initialText;
    }

    public String getText() {
        return text;
    }

    public void setText(String newText) {
        this.text = newText;
    }
    
    public void append(String newText){
        this.text +=newText;
    }
    public void delete(int n){
        if(n > this.text.length()){
           n = this.text.length(); 
        }
        this.text.substring(0, this.text.length()- n);
    }
}
