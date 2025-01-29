package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_LeftTrim {

    @Test
    public void testWordWrap_LeftTrim() throws IOException {
        WordWrap wordWrap = new WordWrap();
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringWriter out = new StringWriter();
        wordWrap.leftTrim(new StringBuilder(" abc"));
        String result = out.toString();
        assertEquals("abc", result);
    }

}