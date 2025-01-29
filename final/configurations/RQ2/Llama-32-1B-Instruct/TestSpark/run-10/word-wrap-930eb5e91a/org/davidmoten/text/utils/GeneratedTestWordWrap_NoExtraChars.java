package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_NoExtraChars {

    @Test
    public void testWordWrap_NoExtraChars() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n", 100L, null, HashSet.of(), false, true);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

}