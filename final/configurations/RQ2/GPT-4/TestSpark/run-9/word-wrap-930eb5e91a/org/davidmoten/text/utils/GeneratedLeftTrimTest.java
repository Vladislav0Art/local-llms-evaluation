package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        WordWrap.StringBuilder2 builder = new WordWrap.StringBuilder2();
        builder.append("   sample");
        WordWrap.leftTrim(builder);
        assertEquals("sample", builder.toString());
    }

}