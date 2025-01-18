package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.Charset;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 sb = new StringBuilder2();
        sb.append('H').append('e').append('l').append('l').append('o');
        WordWrap.leftTrim(sb);
        assertEquals("Hello", sb.toString());
    }

}