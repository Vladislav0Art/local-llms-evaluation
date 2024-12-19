package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromFile {

    @Test
    public void testWordWrap_FromFile() throws IOException {
        WordWrap wordWrap = new WordWrap();
        String input = "This is a sample string";
        int maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = char ->( int)char ;

        wordWrap.wordWrap(wordWrap.fromClasspathUtf8(input), null, "\n", maxWidth, stringWidth);
    }

}