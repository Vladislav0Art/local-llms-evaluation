package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedLeftTrimStringBuilder2Test {

    @Test
    public void leftTrimStringBuilder2Test() {
        StringBuilder2 stringBuilder2 = new StringBuilder2("  Test");
        WordWrap.leftTrim(stringBuilder2);
        assertEquals("Test", stringBuilder2.toString());
    }

}