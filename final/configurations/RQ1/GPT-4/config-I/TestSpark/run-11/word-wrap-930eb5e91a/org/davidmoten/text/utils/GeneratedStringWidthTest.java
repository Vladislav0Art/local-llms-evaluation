package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        Function<CharSequence, Number> stringWidth = (str) -> str.length() * 2;
        Builder builder = WordWrap.from(new StringReader("This is a test"))
                .maxWidth(20)
                .stringWidth(stringWidth)
                .breakWords(true);

        String result = builder.wrap();
        assertEquals("This is a\n test", result);
    }

}