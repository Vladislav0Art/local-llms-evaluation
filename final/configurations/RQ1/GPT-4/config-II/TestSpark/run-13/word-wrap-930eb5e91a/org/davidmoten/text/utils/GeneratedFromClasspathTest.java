package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedFromClasspathTest {

    @Test
    public void fromClasspathTest() {
        WordWrap.Builder result = WordWrap.fromClasspath("", null);

        assertNotNull(result);
    }

}