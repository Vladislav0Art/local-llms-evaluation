package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBreakWordsTest {

    @Test
    public void breakWordsTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        WordWrap.Builder resultBuilder = builder.breakWords(true);
        Assert.assertEquals(builder, resultBuilder);
    }

}