package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        WordWrap.Builder builder = WordWrap.fromUtf8(WordWrapTest.class.getClassLoader().getResourceAsStream("/test.txt"));
        assertNotNull(builder);
    }

}