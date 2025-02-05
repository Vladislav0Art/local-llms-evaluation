package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence text = "Hello World    ";
        text = WordWrap.rightTrim(text);
        Assert.assertEquals("Hello World", text.toString());
    }

}