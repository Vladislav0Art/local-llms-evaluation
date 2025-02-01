package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedWrapWithMaxWidthTest {

    @Test
    public void wrapWithMaxWidthTest() {
        String str = "This string will need to be wrapped because it's too long.";
        String wrappedText = WordWrap.from(str).maxWidth(10).wrap();
        assertEquals("This string will need to be wrapped because it's too long.", wrappedText);
    }

}