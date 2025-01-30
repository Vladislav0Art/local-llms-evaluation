package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        String result = WordWrap.from("ThisIsAReallyLongWord ThatCannotFitInALine").breakWords(true).maxWidth(10).wrap();
        assertTrue(result.contains("ThisIsARea-\n" + "llyLongWor-\n" + "d"));
    }

}