package vn.viettuts.example;

public class TextEditor {
    private SpellChecker spellChecker;

    // inject dependency qua tham số của phương thức.
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Set bo kiem tra chinh ta.");
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
