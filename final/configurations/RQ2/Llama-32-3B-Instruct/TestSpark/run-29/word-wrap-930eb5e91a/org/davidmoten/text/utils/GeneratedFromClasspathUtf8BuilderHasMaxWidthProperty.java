package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathUtf8BuilderHasMaxWidthProperty {

    @Test
    public void fromClasspathUtf8BuilderHasMaxWidthProperty() {
        String resource = "Hello World!";
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        Preconditions.checkState(builder.maxWidth().orElseThrow());
    }

}