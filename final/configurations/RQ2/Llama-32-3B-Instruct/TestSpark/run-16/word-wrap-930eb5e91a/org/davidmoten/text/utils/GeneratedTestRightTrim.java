package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestRightTrim {

    @Test
    public void testRightTrim() {
        String input = "   Hello World  ";
        assertEquals("Hello World", WordWrap.rightTrim(input));
    }

}