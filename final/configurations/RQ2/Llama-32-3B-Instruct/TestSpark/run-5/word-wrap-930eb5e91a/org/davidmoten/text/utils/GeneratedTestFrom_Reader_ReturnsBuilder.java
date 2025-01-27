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

public class GeneratedTestFrom_Reader_ReturnsBuilder {

    public static void main(String[] args) {
        // implementation
    }

    @Test
    public void testFrom_Reader_ReturnsBuilder() {
        Reader reader = new BufferedReader(new InputStreamReader("test"));
        Preconditions.checkNotNull(WordWrap.Builder.from(reader), "Expected a non-null value");
    }

}