package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        final CharSequence trimmed = WordWrap.rightTrim(" This text has extra spaces at the end.   ");
        assertEquals(" This text has extra spaces at the end.", trimmed.toString());
    }

}