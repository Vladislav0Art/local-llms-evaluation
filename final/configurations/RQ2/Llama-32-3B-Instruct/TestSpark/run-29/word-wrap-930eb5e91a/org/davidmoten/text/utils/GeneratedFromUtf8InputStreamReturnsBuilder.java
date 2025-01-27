package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromUtf8InputStreamReturnsBuilder {

    @Test
    public void fromUtf8InputStreamReturnsBuilder() {
        InputStream in = new ByteArrayInputStream("Hello World!".getBytes(StandardCharsets.UTF_8));
        Preconditions.checkState(WordWrap.from(in).isPresent());
    }

}