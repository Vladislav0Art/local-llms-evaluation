package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void testWordWrap_NoWhitespace() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n", 100L, null, null, false, true);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

    @Test
    public void testWordWrap_Whitespace() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n ", 100L, null, null, false, true);
        String result = out.toString();
        assertEquals("Hello\n World", result.trim());
    }

    @Test
    public void testWordWrap_NoExtraChars() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n", 100L, null, HashSet.of(), false, true);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

    @Test
    public void testWordWrap_NoInsertHyphens() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n ", 100L, null, null, false, false);
        String result = out.toString();
        assertEquals("Hello\nWorld", result.trim());
    }

    @Test
    public void testWordWrap_NoBreakWords() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.wordWrap(in, out, "\n ", 100L, null, null, false, true);
        String result = out.toString();
        assertEquals("Hello\n World", result.trim());
    }

    @Test
    public void testWordWrap_LeftTrim() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.leftTrim(new StringBuilder(" abc"));
        String result = out.toString();
        assertEquals("abc", result);
    }

    @Test
    public void testWordWrap_RightTrim() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.rightTrim(new StringBuilder());
        String result = out.toString();
        assertEquals("", result);
    }

}