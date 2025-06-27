import github.andrei.AnagramGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnagramGeneratorTest {
    @Test
    public void shouldGenerateValidAnagramsForAb() {

        AnagramGenerator generator = new AnagramGenerator("ab");
        assertEquals(2, generator.getResult().size());
        assertTrue(generator.getResult().contains("ab"));
        assertTrue(generator.getResult().contains("ba"));
    }

    @Test
    public void shouldReturnEmptyListForEmptyInput() {
        AnagramGenerator generator = new AnagramGenerator("");
        assertEquals(0, generator.getResult().size());
    }

    @Test
    public void shouldReturnEmptyListForInvalidInputWithNumbers() {
        AnagramGenerator generator = new AnagramGenerator("abcde123");
        assertEquals(0, generator.getResult().size());
    }
}
