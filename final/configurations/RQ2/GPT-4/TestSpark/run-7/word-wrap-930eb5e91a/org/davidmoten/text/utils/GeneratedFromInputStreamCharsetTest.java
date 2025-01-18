package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        Assert.assertNotNull(WordWrap.from(System.in, StandardCharsets.UTF_8));
    }

}