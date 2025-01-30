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

public class GeneratedExtraWordCharsTest {

    @Test
    public void extraWordCharsTest() {
        Set<Character> set = toSet("test");
        WordWrap.Builder builder = WordWrap.from("test").extraWordChars(set);
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

}