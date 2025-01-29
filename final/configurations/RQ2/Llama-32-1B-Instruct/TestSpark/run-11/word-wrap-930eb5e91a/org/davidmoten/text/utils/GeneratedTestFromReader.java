package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromReader {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromReader() throws IOException {
        String result = from(new InputStreamReader("Hello World", StandardCharsets.UTF_8));
        assertEquals("Hello World", result);
    }

}