package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_EmptyString {

    protected String word;
    protected int maxWords;

    @Before
    public void setup() {
        word = "";
        maxWords = 10;
    }

    @Test
    public void testWordWrap_EmptyString() {
        Preconditions.checkNotNull(word);
        Preconditions.checkNotNull(maxWords);

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.word(word, maxWords).length());
    }

}