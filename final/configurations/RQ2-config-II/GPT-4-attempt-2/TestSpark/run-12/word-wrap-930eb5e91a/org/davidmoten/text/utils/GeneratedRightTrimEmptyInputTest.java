package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Collections;

import static org.junit.Assert.*;

public class GeneratedRightTrimEmptyInputTest {

    @Test
    public void rightTrimEmptyInputTest() {
        CharSequence trimmed = WordWrap.rightTrim("");
        assertNotNull(trimmed);
        assertEquals("", trimmed.toString());
    }

}