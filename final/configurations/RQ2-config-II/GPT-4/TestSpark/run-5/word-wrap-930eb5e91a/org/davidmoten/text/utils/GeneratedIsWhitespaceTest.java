package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        CharSequence text = "Hello World";
        boolean result = WordWrap.isWhitespace(text);
        Assert.assertFalse(result);

        text = " \n\t\r";
        result = WordWrap.isWhitespace(text);
        Assert.assertTrue(result);
    }

}