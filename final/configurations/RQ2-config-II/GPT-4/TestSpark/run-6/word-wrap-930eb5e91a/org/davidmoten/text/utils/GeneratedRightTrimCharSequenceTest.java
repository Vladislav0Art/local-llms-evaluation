package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedRightTrimCharSequenceTest {

    @Test
    public void rightTrimCharSequenceTest() {
        CharSequence charSequence = new StringBuilder("Test  ");
        assertEquals("Test", WordWrap.rightTrim(charSequence));
    }

}