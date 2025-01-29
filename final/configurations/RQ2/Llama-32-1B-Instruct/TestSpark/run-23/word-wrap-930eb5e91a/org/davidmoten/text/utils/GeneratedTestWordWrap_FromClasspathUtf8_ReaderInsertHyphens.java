package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderInsertHyphens {

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderInsertHyphens() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        boolean insertHyphens = true;
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, insertHyphens, false, true);
        assert "Hello\nWorld".length() == 13;
    }

}