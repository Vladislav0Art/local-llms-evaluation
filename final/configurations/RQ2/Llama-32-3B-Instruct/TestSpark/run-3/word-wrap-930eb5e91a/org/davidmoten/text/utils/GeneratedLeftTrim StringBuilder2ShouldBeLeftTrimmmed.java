package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedLeftTrim StringBuilder2ShouldBeLeftTrimmmed {

    @Test
    public void leftTrim

    StringBuilder2ShouldBeLeftTrimmmed() {
        StringBuilder2 word = new StringBuilder2("   Hello World   ");
        assertEquals(word.substring(0, 8), WordWrap.leftTrim(word));
    }

}