package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        WordWrap.Builder builder = WordWrap.from(new File("/textFile.txt"), StandardCharsets.UTF_8);
        assertEquals(java.io.BufferedReader.class, builder.getClass());
    }

}