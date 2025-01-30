package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedWrapToStringTest {

    @Test
    public void wrapToStringTest() {
        String text = "Test string";
        String wrappedText = WordWrap.from(text).wrap();
        Assert.assertTrue(wrappedText.startsWith(text));
    }

}