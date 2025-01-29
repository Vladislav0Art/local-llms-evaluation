package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromClasspathUtf8 {

    public static Writer from(Reader reader, boolean close) {
        return new WordWrap().from(reader, close);
    }

    @Test
    public void testFromClasspathUtf8() throws IOException {
        Writer result = fromClasspath();
        assertEquals("Hello World", result.toString());
    }

    private static Writer fromClasspath() {
        return new WordWrap().from(System.in, System.out);
    }

}