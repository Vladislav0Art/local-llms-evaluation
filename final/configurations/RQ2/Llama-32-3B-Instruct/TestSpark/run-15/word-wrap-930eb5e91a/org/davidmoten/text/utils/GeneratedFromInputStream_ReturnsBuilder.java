package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFromInputStream_ReturnsBuilder {

    @Test
    public void fromInputStream_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new ByteArrayInputStream(new byte[]{'H', 'e', 'l', 'l', 'o'}), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }

}