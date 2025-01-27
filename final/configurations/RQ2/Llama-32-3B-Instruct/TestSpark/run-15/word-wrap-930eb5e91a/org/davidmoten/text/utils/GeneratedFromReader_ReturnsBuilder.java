package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFromReader_ReturnsBuilder {

    @Test
    public void fromReader_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.from(new StringReader("Hello World"));
        assertNotNull(builder);
    }

}