package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        Assert.assertTrue(WordWrap.isWhitespace("   "));
        Assert.assertFalse(WordWrap.isWhitespace("Test"));
    }

}