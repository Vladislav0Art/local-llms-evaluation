package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        String text = "  ";
        Assert.assertTrue(WordWrap.isWhitespace(text));
    }

}