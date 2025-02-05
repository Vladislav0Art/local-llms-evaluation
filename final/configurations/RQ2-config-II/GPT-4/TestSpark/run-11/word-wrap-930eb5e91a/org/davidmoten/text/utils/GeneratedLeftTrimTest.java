package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException {
        StringBuilder str = new StringBuilder("       Hello");
        org.davidmoten.text.utils.WordWrap.getClass().getMethod("leftTrim", StringBuilder.class).invoke(null, str);
        assertEquals("Hello", str.toString());
    }

}