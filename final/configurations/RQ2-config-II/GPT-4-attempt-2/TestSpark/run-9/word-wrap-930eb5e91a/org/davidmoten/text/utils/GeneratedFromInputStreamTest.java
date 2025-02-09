package org.davidmoten.text.utils;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;

public class GeneratedFromInputStreamTest {

    @Test
    public void fromInputStreamTest() throws IOException {
        Builder builder = WordWrap.from(getClass().getResourceAsStream("/test.txt"), StandardCharsets.UTF_8);
        assertTrue(builder instanceof WordWrap.Builder);
    }

}