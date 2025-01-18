package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("sample   ");
        assertEquals("sample", trimmed.toString());
        trimmed = WordWrap.rightTrim("   sample");
        assertEquals("   sample", trimmed.toString());
    }

}