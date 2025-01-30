package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedInsertHyphensTest {

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.insertHyphens(true);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

}