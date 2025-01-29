package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_Whitespace {

    @Test
    public void testWordWrap_Whitespace() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n ", 100L, null, null, false, true);
        String result = out.toString();
        assertEquals("Hello\n World", result.trim());
    }

}