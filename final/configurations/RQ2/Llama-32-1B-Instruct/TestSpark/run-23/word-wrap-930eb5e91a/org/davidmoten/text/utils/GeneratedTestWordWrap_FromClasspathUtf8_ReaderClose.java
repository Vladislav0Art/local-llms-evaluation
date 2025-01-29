package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderClose {

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderClose() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close();
        assert "World".length() == 6;
    }

}