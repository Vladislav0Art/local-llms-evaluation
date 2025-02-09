package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        Builder builder = WordWrap.from("");
        assertNotNull(builder);
    }

}