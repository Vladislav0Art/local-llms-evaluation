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

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test").breakWords(true);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

}