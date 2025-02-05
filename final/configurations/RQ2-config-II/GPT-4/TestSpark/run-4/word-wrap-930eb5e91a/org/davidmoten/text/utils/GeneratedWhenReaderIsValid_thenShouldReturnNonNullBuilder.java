package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static org.junit.Assert.*;

public class GeneratedWhenReaderIsValid_thenShouldReturnNonNullBuilder {

    @Test
    public void whenReaderIsValid_thenShouldReturnNonNullBuilder() {
        assertNotNull(WordWrap.from(new StringReader("Hello, World!")));
    }
}

}