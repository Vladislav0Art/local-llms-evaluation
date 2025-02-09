package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        Builder builder = WordWrap.fromUtf8(null);
        assertNotNull(builder);
    }

}