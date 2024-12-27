package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        String input = "Test Input";
        assertNotNull(WordWrap.fromUtf8(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8))));
    }

}