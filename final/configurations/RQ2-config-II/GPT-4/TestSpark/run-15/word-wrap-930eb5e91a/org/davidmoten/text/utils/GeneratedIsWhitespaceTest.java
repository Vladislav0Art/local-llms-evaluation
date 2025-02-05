package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class GeneratedIsWhitespaceTest {

    @Test
    public void isWhitespaceTest() {
        boolean zeroLen = WordWrap.isWhitespace("");
        boolean space = WordWrap.isWhitespace("    ");
        boolean noSpace = WordWrap.isWhitespace("no space");
        Assert.assertTrue(zeroLen);
        Assert.assertTrue(space);
        Assert.assertFalse(noSpace);
    }

}