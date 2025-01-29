package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderBreakWords {

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderBreakWords() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        boolean breakWords = true;
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, breakWords, false, true);
        assert "World\n".length() == 7;
    }

}