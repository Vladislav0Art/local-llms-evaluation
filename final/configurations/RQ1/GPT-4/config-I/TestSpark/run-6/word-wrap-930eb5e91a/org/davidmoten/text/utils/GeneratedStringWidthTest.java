package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        StringReader stringReader = new StringReader("abcdefghij");
        Builder builder = WordWrap.from(stringReader);
        builder.stringWidth(s -> s.toString().getBytes().length);

        String result = builder.wrap();

        assertEquals("abcdefghij", result);
    }

}