package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromReaderTest() {
        String result = WordWrap.from(new StringReader("This is a sample text.")).wrap();
        assertEquals("This is a sample text.", result);
    }

    @Test
    public void fromTextTest() {
        String result = WordWrap.from("This is a sample text.").wrap();
        assertEquals("This is a sample text.", result);
    }

    @Test
    public void maxWidthTest() {
        String result = WordWrap.from("This is a sample text with more than thirty characters.").maxWidth(30).wrap();
        assertTrue(Arrays.stream(result.split("\n")).allMatch(s -> s.length() <= 30));
    }

    @Test
    public void newLineTest() {
        String result = WordWrap.from("This is a sample text.\nThis is a second line.").newLine("--").wrap();
        assertTrue(result.contains("--"));
    }

    @Test
    public void breakWordsTest() {
        String result = WordWrap.from("ThisIsAReallyLongWord ThatCannotFitInALine").breakWords(true).maxWidth(10).wrap();
        assertTrue(result.contains("ThisIsARea-\n" + "llyLongWor-\n" + "d"));
    }

    @Test
    public void insertHyphensTest() {
        String result = WordWrap.from("ThisIsAReallyLongWord ThatCannotFitInALine").breakWords(true).insertHyphens(false).maxWidth(10).wrap();
        assertTrue(result.contains("ThisIsARea\n" + "llyLongWor\n" + "d"));
    }

    @Test
    public void wrapTest() {
        String result = WordWrap.from("This is a sample text.").wrap();
        assertTrue(result instanceof String);
    }

    @Test
    public void maxWidthLessThanEqualToZeroTest() {
        WordWrap.from("Test").maxWidth(0).wrap();
    }

}