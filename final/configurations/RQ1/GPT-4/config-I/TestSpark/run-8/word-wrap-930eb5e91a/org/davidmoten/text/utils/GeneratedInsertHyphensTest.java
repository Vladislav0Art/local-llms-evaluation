package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Assert;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedInsertHyphensTest {

    @Test
    public void insertHyphensTest() {
        WordWrap.Builder builder = WordWrap.from("test");
        WordWrap.Builder resultBuilder = builder.insertHyphens(true);
        Assert.assertEquals(builder, resultBuilder);
    }

}