package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestWordWrapFromReader {

    private static final String INPUT_FILE = "hello-world.txt";
    private static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static final Reader reader = new BufferedReader[]{};
    private static final Writer out = new BufferedWriter(new OutputStreamWriter(System.out));

    @Mock
    public BufferedReader getReader() {
        return reader;
    }

    @Mock
    public void setOutput(BufferedWriter out) {
        this.out = out;
    }

    @Test
    public void testWordWrapFromReader() throws Exception {
        WordWrap wordWrap = new WordWrap();
        String result = wordWrap.wordWrap("Hello World", 20, stringWidth::new, extraWordChars, insertHyphens, breakWords);
        assertEquals("Hello World", result);
    }

}