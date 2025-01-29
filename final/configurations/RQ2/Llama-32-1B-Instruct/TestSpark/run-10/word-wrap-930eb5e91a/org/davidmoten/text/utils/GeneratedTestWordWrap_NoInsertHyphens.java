package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_NoInsertHyphens {

    @Test
    public void testWordWrap_NoInsertHyphens() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n ", 100L, null, null, false, false);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

}