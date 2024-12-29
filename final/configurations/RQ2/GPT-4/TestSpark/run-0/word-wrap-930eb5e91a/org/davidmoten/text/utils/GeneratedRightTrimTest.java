package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence test = "  Testing..  ";
        CharSequence trimmed = WordWrap.rightTrim(test);
        assertEquals("  Testing..", trimmed.toString());
    }

}