package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromReader BuilderShouldReturnBuilder {

    @Test
    public void fromReader

    BuilderShouldReturnBuilder() {
        try (WordWrap.Builder builder = WordWrap.from(new String[]{"Hello", "World"})) {
            assertNotNull(builder);
        }
    }

}