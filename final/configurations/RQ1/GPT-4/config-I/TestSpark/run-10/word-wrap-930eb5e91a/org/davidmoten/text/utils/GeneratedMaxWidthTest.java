package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedMaxWidthTest {

    @Test
    public void maxWidthTest() {
        String result = WordWrap.from("This is a sample text with more than thirty characters.").maxWidth(30).wrap();
        assertTrue(Arrays.stream(result.split("\n")).allMatch(s -> s.length() <= 30));
    }

}