package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestFromClasspath {

    @Test
    public void testFromClasspath() throws IOException {
        WordWrap.Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        assertEquals("Hello World", builder.build());
    }

    @VisibleForTesting
    public static Writer from(Reader reader, boolean close) {
        return new Writer(new OutputStreamWriter(new FileOutputStream("target") {
        }));
    }

}