package github.andrei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnagramGenerator {
    // Apenas letras (inclusive acentuadas), pelo menos uma
    private static final String REGULAR_EXPRESSION = "^[\\p{L}]+$";

    private String input;
    private final List<String> result = new ArrayList<>();

    public List<String> getResult() {
        return result;
    }

    public AnagramGenerator() {
        this.input = this.inputGenerator();
        this.outputGenerationAnagrams();
    }

    public AnagramGenerator(String input) {
        this.input = input;
        this.outputGenerationAnagrams();
    }

    private String inputGenerator() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com as letras para gerar os Anagramas: ");

        return scanner.nextLine();
    }

    private void assembleAnagrams(String prefix, String input, List<String> finalAnagrams) {

        if (input.isEmpty()) {
            finalAnagrams.add(prefix);
            return;
        }

        for (int i = 0; i < input.length(); i++) {
            char fixed = input.charAt(i);
            String before = input.substring(0, i);
            String after = input.substring(i + 1);
            String nextPrefix = prefix + fixed;
            String nextRemaining = before + after;
            assembleAnagrams(nextPrefix, nextRemaining, finalAnagrams);
        }

    }

    private void outputGenerationAnagrams() {

        if (!this.isValidInput(this.input)) {
            System.out.println("Erro ao gerar os Anagramas - Valor de entrada invalido");
            return;
        }

        this.assembleAnagrams("", this.input, result);

        for (String anagram : result) {
            System.out.println(anagram);
        }

        System.out.println("Total de Anagramas encontrados : " + result.size());
    }

    private boolean isValidInput(String input) {
        return input != null && !input.isEmpty() && input.matches(REGULAR_EXPRESSION);
    }

}
