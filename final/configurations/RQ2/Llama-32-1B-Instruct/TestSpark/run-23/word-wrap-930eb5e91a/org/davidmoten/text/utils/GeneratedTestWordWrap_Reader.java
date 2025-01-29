package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_Reader {

    @Test
    public void testWordWrap_Reader() {
        WordWrap wordWrap = WordWrap.from(new InputStreamReader(System.in));
        wordWrap.wordWrap("Hello, world!", System.out, "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close(System.out);
        assert "World".length() == 6;
    }

}