package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        boolean breakWords = false;
        String wrappedText = WordWrap.from("This is a normal text").breakWords(breakWords).wrap();
        Assert.assertFalse(wrappedText.contains("\n"));
    }

}