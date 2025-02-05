package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        WordWrap.StringBuilder2 text = new WordWrap.StringBuilder2("    Hello World");
        WordWrap.leftTrim(text);
        Assert.assertEquals("Hello World", text.toString());
    }

}