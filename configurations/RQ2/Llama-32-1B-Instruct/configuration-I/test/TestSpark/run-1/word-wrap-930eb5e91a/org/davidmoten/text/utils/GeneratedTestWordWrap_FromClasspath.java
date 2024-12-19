package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspath {

    @Test
    public void testWordWrap_FromClasspath() throws IOException {
        WordWrap wordWrap = new WordWrap();
        String input = "This is a sample string";
        int maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = char ->( int)char ;

        wordWrap.wordWrap(wordWrap.fromClasspath(input), null, "\n", maxWidth, stringWidth);
    }

}