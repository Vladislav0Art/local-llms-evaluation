package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderFunction {

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderFunction() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        Function<CharSequence, Number> stringWidth = s -> s.length();
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, stringWidth, HashSet.of(' '), false, true);
        assert "World".length() == 6;
    }

}