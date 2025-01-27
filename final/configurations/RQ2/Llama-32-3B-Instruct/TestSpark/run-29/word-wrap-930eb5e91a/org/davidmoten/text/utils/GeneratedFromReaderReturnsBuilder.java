package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReaderReturnsBuilder {

    @Test
    public void fromReaderReturnsBuilder() {
        Reader reader = new ByteArrayInputStream("Hello World!".getBytes(StandardCharsets.UTF_8));
        Preconditions.checkState(WordWrap.from(reader).isPresent());
    }

}