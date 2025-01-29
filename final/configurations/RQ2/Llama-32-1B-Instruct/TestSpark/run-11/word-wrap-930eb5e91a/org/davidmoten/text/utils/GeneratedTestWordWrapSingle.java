package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestWordWrapSingle {

    @Test
    public void testWordWrapSingle() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader("Hello"));
        WordWrap.Builder builder = WordWrap.fromClasspath("resource", StandardCharsets.UTF_8);
        String result = builder.build();
        assertTrue(result.startsWith("H") && result.endsWith("llo"));
    }

}