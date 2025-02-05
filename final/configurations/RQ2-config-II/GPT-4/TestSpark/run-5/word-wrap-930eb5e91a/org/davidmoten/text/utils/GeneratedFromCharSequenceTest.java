package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        CharSequence text = "Hello World";
        WordWrap.Builder builder = WordWrap.from(text);
        Assert.assertNotNull(builder);
    }

}