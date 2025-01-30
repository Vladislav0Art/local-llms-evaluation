package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedNewLineTest {

    @Test
    public void newLineTest() {
        String newLine = "\r";
        String wrappedText = WordWrap.from("This is a normal text").newLine(newLine).wrap();
        Assert.assertTrue(wrappedText.contains(newLine));
    }

}