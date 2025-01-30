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

public class GeneratedFromUtf8Test {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void fromUtf8Test() throws UnsupportedEncodingException {
        InputStream in = new ByteArrayInputStream("Some input string".getBytes(StandardCharsets.UTF_8));
        Builder builder = WordWrap.fromUtf8(in);
        Assert.assertNotNull(builder);
    }

}