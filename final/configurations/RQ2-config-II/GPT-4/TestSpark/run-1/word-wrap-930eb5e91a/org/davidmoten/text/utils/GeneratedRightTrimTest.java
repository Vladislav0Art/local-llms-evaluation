package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        CharSequence trimmed = WordWrap.rightTrim("   Sample Text   ");
        assertEquals("   Sample Text", trimmed.toString());
    }

}