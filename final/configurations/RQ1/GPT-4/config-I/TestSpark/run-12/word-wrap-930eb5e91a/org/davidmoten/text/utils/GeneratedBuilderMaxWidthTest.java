package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedBuilderMaxWidthTest {

    @Test
    public void builderMaxWidthTest() {
        WordWrap.Builder builder = WordWrap.from("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin semper.");
        builder.maxWidth(40);
        String wrappedText = builder.wrap();
        assertNotNull(wrappedText);
        assertTrue(wrappedText.length() > 0);
    }

}