package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromFileWithSpaceBetweenWords {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromFileWithSpaceBetweenWords() throws IOException {
        String[] lines = {"Hello  World"};
        String result = fromLines(lines);
        assertEquals("Hello   World", result);
    }

}