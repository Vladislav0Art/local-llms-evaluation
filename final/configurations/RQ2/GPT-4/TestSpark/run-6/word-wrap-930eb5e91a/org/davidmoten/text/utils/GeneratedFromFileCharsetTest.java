package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() {
        File file = new File("src/test/resources/sample.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}