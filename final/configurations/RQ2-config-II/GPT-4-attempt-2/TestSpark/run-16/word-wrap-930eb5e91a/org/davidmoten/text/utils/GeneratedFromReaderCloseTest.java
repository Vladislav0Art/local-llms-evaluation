package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromReaderCloseTest {

    @Test
    public void fromReaderCloseTest() {
        Builder builder = WordWrap.from(new StringReader(""), true);
        assertNotNull(builder);
    }

}