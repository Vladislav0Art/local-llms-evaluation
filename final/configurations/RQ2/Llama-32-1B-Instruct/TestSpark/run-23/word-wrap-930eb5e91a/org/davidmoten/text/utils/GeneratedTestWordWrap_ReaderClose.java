package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_ReaderClose {

    @Test
    public void testWordWrap_ReaderClose() {
        WordWrap wordWrap = WordWrap.from(new InputStreamReader(System.in));
        wordWrap.wordWrap("Hello, world!", new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close();
        assert "World".length() == 6;
    }

}