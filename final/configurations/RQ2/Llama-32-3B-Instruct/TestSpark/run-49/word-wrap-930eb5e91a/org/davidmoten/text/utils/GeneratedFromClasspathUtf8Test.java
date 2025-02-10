package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromClasspathUtf8Test {

    @Test
    public void fromClasspathUtf8Test() {
        String resource = "test.txt";
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        // Assuming the resource is located in classpath
        Preconditions.assertNotNull(WordWrap.fromClasspathUtf8(resource));
    }

}