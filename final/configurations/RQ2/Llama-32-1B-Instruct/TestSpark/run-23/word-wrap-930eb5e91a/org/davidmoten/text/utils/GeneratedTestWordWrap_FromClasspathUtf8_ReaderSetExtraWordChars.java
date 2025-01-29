package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderSetExtraWordChars {

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderSetExtraWordChars() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        Set<Character> extraWordChars = HashSet.of(' ');
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, extraWordChars, false, true);
        assert "World".length() == 6;
    }

}