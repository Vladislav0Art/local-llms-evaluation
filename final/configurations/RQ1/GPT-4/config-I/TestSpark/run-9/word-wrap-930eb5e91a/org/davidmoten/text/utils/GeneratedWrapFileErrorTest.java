package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

public class GeneratedWrapFileErrorTest {

    @Test
    public void wrapFileErrorTest() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("hello world"));
        builder.wrap(new File("/noAccessDirectory/output.txt"), StandardCharsets.UTF_8);
    }

}