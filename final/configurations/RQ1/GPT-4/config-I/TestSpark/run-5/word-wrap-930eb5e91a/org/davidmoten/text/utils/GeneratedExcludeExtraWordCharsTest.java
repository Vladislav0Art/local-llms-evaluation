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

public class GeneratedExcludeExtraWordCharsTest {

    @Test
    public void excludeExtraWordCharsTest() {
        WordWrap.Builder builder = WordWrap.from("test").excludeExtraWordChars("test");
        assertEquals(builder.getClass(), WordWrap.Builder.class);
    }

}