package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedIsNotWhitespaceTest {

    @Test
    public void isNotWhitespaceTest() {
        String text = "Hello, World!";
        Assert.assertFalse(WordWrap.isWhitespace(text));
    }

}