package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_RightTrim {

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