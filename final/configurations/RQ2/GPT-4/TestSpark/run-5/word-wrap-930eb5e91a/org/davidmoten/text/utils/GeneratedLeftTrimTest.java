package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder word = new StringBuilder("  Hello, World!");
        WordWrap.leftTrim(word);
        Assert.assertEquals("Hello, World!", word.toString());
    }

}