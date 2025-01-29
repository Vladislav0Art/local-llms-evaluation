package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspath_Reader {

    @Test
    public void testWordWrap_FromClasspath_Reader() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        assert "World".length() == 6;
    }

}