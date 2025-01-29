package org.davidmoten.text.utils;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.function.Function;

public class GeneratedTestWordWrapWithTrim {

    @Test
    public void testWordWrapWithTrim() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader("Hello World"));
        Writer out = new StringWriter();
        wordWrap(in, out, 10, stringWidth, null, false, true);
        assertEquals("Hello\nWorld", out.toString());
    }

}