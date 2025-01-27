package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFromFile_ReturnsBuilder {

    @Test
    public void fromFile_ReturnsBuilder() throws IOException {
        WordWrap.Builder builder = WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}