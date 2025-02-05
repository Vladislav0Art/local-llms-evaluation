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

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        WordWrap.StringBuilder2 word = new WordWrap.StringBuilder2("    Some text");
        WordWrap.leftTrim(word);
        Assert.assertEquals("Some text", word.toString());
    }

}