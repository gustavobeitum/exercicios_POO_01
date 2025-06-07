package Exercicio_1_2.core;

public class Palindromo {
    private String word;

    public Palindromo(String word){
        this.word = word.toLowerCase();
    }

    public String getWord(){
        return word.toUpperCase();
    }

    public boolean isPalindromo() {
        String cleanWord = word.replaceAll("[^a-zA-Z0-9]", "");
        int i = 0;
        int j = cleanWord.length() - 1;

        while (i < j) {
            if (cleanWord.charAt(i) != cleanWord.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
