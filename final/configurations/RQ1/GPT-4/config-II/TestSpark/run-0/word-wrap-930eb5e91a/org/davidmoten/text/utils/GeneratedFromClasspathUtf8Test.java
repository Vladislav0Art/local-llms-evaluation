package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        String output = WordWrap.fromClasspathUtf8("/input.txt").wrap();
        assertTrue(output.length() > 0);
    }

}