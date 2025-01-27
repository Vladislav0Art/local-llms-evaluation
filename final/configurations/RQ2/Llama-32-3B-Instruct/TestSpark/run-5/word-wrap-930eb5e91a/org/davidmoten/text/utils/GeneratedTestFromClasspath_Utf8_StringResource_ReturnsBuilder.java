package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

public class GeneratedTestFromClasspath_Utf8_StringResource_ReturnsBuilder {

    public static void main(String[] args) {
        // implementation
    }

    @Test
    public void testFromClasspath_Utf8_StringResource_ReturnsBuilder() {
        String resource = "resource";
        Preconditions.checkNotNull(WordWrap.Builder.fromClasspathUtf8(resource), "Expected a non-null value");
    }

}