package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 sb = mock(StringBuilder2.class);
        WordWrap.leftTrim(sb);
        assertTrue(sb != null);
    }

}