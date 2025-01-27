package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromClasspathUtf8ReturnsBuilder {

    @Test
    public void fromClasspathUtf8ReturnsBuilder() {
        String resource = "Hello World!";
        Preconditions.checkState(WordWrap.fromClasspathUtf8(resource).isPresent());
    }

}