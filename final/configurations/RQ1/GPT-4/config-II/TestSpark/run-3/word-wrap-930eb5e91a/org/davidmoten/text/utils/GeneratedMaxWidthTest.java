package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedMaxWidthTest {

    @Test
    public void maxWidthTest() {
        HashSet<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('T');
        String result = WordWrap
                .from("Testing")
                .maxWidth(80)
                .stringWidth(CharSequence::length)
                .newLine("\n")
                .extraWordChars(extraWordChars)
                .extraWordChars("\"")
                .includeExtraWordChars("a")
                .excludeExtraWordChars("e")
                .insertHyphens(true)
                .breakWords(true)
                .wrap();
        assertEquals("Testing", result);
    }

}