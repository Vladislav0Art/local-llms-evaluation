package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder2 stringBuilder2 = new StringBuilder2();
        stringBuilder2.append("     test data");
        WordWrap.leftTrim(stringBuilder2);
        assertEquals("test data", stringBuilder2.toString());
    }

}