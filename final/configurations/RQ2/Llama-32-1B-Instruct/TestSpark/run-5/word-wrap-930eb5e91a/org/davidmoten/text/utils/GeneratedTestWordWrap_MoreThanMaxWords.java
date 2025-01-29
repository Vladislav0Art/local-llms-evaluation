package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_MoreThanMaxWords {

    protected String word;
    protected int maxWords;

    @Before
    public void setup() {
        word = "";
        maxWords = 10;
    }

    @Test
    public void testWordWrap_MoreThanMaxWords() {
        Preconditions.checkNotNull(word);
        Preconditions.checkNotNull(maxWords);

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.word(word, maxWords).length());
    }

    protected abstract String stringWidth();

    protected String word(String s) {
        return s;
    }

}