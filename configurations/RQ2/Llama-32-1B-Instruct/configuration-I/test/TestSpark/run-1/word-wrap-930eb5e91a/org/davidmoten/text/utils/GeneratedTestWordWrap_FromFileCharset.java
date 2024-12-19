package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromFileCharset {

    @Test
    public void testWordWrap_FromFileCharset() throws IOException {
        WordWrap wordWrap = new WordWrap();
        String input = "This is a sample string";
        int maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = char ->( int)char ;

        wordWrap.wordWrap(wordWrap.fromClasspathUtf8(input), null, "\n", maxWidth, stringWidth);
    }

}