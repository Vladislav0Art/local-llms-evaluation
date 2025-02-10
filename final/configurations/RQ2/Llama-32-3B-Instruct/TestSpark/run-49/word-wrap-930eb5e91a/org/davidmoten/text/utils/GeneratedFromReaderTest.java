package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        List<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("World");
        Reader reader = new MockReader(words);
        Preconditions.assertNotNull(WordWrap.from(reader));
    }

}