package org.davidmoten.text.utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class GeneratedRightTrimTest {

    @Test
    public void rightTrimTest() {
        assertEquals("test", WordWrap.rightTrim("test   "));
    }

}