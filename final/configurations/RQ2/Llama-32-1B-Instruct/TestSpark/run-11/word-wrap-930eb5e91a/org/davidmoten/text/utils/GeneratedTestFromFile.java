package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromFile {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromFile() throws IOException {
        String[] lines = {"Hello World"};
        String result = fromLines(lines);
        assertEquals("Hello World", result);
    }

    private static Writer fromLines(String... lines) {
        return new WordWrap().from(lines, System.out);
    }

}