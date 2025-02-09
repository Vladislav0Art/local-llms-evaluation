package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 stringBuilder = new StringBuilder2();
        stringBuilder.append("  Hello");
        WordWrap.leftTrim(stringBuilder);
        assertEquals("Hello", stringBuilder.toString());
    }

}