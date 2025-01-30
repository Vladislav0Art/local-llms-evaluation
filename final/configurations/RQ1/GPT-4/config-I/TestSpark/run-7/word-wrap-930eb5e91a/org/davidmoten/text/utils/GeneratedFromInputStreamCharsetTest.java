package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Set;

public class GeneratedFromInputStreamCharsetTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void fromInputStreamCharsetTest() throws UnsupportedEncodingException {
        InputStream in = new ByteArrayInputStream("Some input string".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.from(in, StandardCharsets.UTF_8);
        Assert.assertNotNull(builder);
    }

}