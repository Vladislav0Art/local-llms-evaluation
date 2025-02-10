package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() {
        File file = new File("test.txt");
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        Preconditions.assertNotNull(WordWrap.from(file, StandardCharsets.UTF_8));
    }

}