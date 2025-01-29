package org.davidmoten.text.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class GeneratedTestWordWrapFromReaderBreakWords {

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
    public void testWordWrapFromReaderBreakWords() throws Exception {
        String inputContent = fromReader(new Reader[]{});
        WordWrap wordWrap = new WordWrap();
        wordWrap.wordWrap(inputContent, 20, stringWidth::new, extraWordChars, insertHyphens, breakWords);
        verify(out).write("Hello ");
    }

}