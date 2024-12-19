package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_ReaderClose {

    @Test
    public void testWordWrap_ReaderClose() throws IOException {
        WordWrap wordWrap = new WordWrap();
        String input = "This is a sample string";
        int maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = char ->( int)char ;

        wordWrap.wordWrap(wordWrap.from(new InputStreamReader(System.in), true), null, "\n", maxWidth, stringWidth);
        assertEquals(0, System.in.availableBytes());
    }

}