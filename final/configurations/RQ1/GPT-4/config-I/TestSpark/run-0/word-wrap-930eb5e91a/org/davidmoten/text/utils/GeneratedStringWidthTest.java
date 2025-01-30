package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        Function<? super CharSequence, ? extends Number> stringWidth = (s -> s.length());
        Builder builder = WordWrap.from("test");
        builder.stringWidth(stringWidth);
        assertEquals(builder.stringWidth, stringWidth);
    }

}