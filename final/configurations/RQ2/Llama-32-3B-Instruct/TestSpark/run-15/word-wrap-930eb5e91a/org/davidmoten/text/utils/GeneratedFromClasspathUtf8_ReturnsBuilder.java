package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

public class GeneratedFromClasspathUtf8_ReturnsBuilder {

    @Test
    public void fromClasspathUtf8_ReturnsBuilder() {
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("resource.txt");
        assertNotNull(builder);
    }

}