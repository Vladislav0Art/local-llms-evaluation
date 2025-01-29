package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_MoreThanOneChar {

    protected String word;
    protected int maxWords;

    @Before
    public void setup() {
        word = "";
        maxWords = 10;
    }

    @Test
    public void testWordWrap_MoreThanOneChar() {
        Preconditions.checkNotNull(word);
        Preconditions.checkNotNull(maxWords);

        WordWrap wordWrap = new WordWrap();
        assertEquals(0, wordWrap.word("abc", maxWords).length());
        assertEquals(1, wordWrap.word("abc", 5).length());
    }

}