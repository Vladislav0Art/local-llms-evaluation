package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 builder = new StringBuilder2("   hello world");
        WordWrap.leftTrim(builder);
        assertEquals("hello world", builder.toString());
    }

}