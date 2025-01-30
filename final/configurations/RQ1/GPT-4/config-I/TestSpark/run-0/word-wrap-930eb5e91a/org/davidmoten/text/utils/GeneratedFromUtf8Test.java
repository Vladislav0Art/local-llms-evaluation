package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedFromUtf8Test {

    private String testText = "This is a simple test text to be used for testing word wrap functionality";

    @Test
    public void fromUtf8Test() {
        Builder builder = WordWrap.fromUtf8(System.in);
        assertNotNull(builder);
    }

}