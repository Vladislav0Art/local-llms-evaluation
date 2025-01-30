package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class GeneratedFromFileCharsetTest {

    @Test
    public void fromFileCharsetTest() throws IOException {
        File file = new File("src/test/resources/file.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);

        String result = builder.wrap();

        assertEquals("", result);
    }

}