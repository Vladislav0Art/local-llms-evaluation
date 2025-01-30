package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedWrapFileTest {

    @Test
    public void wrapFileTest() {
        File file = new File("output.txt");
        WordWrap.Builder builder = WordWrap.from(new StringReader("hello world"));
        builder.wrap(file, StandardCharsets.UTF_8);
        assertTrue(file.exists());
        if (file.exists()) {
            file.delete();
        }
    }

}