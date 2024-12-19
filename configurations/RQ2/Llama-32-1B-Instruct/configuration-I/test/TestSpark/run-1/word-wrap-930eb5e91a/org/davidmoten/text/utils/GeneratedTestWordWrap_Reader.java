package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_Reader {

    @Test
    public void testWordWrap_Reader() throws IOException {
        WordWrap wordWrap = new WordWrap();
        String input = "This is a sample string";
        String output = "";
        int maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = char ->( int)char ;
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = false;

        wordWrap.wordWrap(wordWrap.from(new InputStreamReader(System.in), true), output, "\n", maxWidth, stringWidth, extraWordChars, insertHyphens);
        assertEquals(input.length(), output.length());
    }

}