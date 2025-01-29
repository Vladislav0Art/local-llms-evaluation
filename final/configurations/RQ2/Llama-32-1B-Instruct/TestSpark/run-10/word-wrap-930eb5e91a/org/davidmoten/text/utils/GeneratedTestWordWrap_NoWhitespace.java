package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_NoWhitespace {

    @Test
    public void testWordWrap_NoWhitespace() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n", 100L, null, null, false, true);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

}