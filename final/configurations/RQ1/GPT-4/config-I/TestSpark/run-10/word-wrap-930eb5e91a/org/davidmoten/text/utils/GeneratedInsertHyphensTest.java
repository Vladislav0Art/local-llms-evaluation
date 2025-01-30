package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedInsertHyphensTest {

    @Test
    public void insertHyphensTest() {
        String result = WordWrap.from("ThisIsAReallyLongWord ThatCannotFitInALine").breakWords(true).insertHyphens(false).maxWidth(10).wrap();
        assertTrue(result.contains("ThisIsARea\n" + "llyLongWor\n" + "d"));
    }

}