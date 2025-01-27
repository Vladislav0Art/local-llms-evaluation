package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static com.github.davidmoten.guavamini.Preconditions.checkArgument;

public class GeneratedFromClasspathResourceCloseTest {

    @Test
    public void fromClasspathResourceCloseTest() {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("hello");
        WordWrap.close(builder.reader());
    }

}