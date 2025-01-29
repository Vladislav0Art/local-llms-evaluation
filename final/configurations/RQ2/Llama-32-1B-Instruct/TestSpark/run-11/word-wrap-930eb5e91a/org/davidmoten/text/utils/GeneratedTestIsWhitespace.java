package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestIsWhitespace {

    @Test
    public void testIsWhitespace() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader("Hello World"));
        assertEquals(true, WordWrap.isWhitespace(in.readLine()));
    }

}