package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromFileWithSpacesBetweenWords {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromFileWithSpacesBetweenWords() throws IOException {
        String[] lines = {"Hello   World"};
        Writer result = fromLines(lines);
        assertEquals("Hello     World", result.toString());
    }

}