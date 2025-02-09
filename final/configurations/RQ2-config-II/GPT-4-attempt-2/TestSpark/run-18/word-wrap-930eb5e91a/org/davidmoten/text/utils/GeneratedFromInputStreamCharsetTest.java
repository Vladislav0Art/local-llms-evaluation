package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;

public class GeneratedFromInputStreamCharsetTest {

    @Test
    public void fromInputStreamCharsetTest() {
        String input = "Test data";
        assertNotNull(WordWrap.from(InputStreamUtil.toStream(input), StandardCharsets.UTF_8));
    }

}