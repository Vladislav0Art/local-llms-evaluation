package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        InputStream is = new ByteArrayInputStream("test1".getBytes(StandardCharsets.UTF_8));
        WordWrap.Builder builder = WordWrap.fromUtf8(is);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

}