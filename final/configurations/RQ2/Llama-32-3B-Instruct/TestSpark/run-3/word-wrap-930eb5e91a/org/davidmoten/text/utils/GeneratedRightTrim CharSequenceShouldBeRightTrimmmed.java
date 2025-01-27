package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedRightTrim CharSequenceShouldBeRightTrimmmed {

    @Test
    public void rightTrim

    CharSequenceShouldBeRightTrimmmed() {
        CharSequence s = "   Hello World   ";
        assertEquals(s.substring(5, 11), WordWrap.rightTrim(s));
    }

}