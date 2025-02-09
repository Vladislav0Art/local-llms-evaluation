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

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() throws IOException {
        Builder builder = WordWrap.fromUtf8(getClass().getResourceAsStream("/test.txt"));
        assertTrue(builder instanceof WordWrap.Builder);
    }

}