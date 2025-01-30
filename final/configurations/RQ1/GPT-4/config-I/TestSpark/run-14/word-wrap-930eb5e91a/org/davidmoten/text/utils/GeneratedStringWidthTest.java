package org.davidmoten.text.utils;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Function;

public class GeneratedStringWidthTest {

    @Test
    public void stringWidthTest() {
        Function<? super CharSequence, ? extends Number> stringWidth = s -> s.toString().toUpperCase().length();
        List<String> wordWrapLines = WordWrap.from("This is a normal text").stringWidth(stringWidth).wrapToList();
        Assert.assertFalse(wordWrapLines.isEmpty());
    }

}