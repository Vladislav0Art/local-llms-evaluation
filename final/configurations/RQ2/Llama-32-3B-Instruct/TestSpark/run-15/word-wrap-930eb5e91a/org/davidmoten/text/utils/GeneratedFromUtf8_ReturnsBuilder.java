package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFromUtf8_ReturnsBuilder {

    @Test
    public void fromUtf8_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromUtf8(new ByteArrayInputStream(new byte[]{'H', 'e', 'l', 'l', 'o'}));
        assertNotNull(builder);
    }

}