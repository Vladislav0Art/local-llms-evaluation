package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedRightTrimWithWhiteSpacesTest {

    @Test
    public void rightTrimWithWhiteSpacesTest() {
        CharSequence trimmed = WordWrap.rightTrim("    ");
        assertNotNull(trimmed);
        assertEquals("", trimmed.toString());
    }

}