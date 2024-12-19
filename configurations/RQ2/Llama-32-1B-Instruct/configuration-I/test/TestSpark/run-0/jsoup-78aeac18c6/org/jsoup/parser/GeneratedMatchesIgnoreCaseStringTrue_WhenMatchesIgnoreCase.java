package org.jsoup.parser;

public class GeneratedMatchesIgnoreCaseStringTrue_WhenMatchesIgnoreCase {

    @Test
    public void matchesIgnoreCaseStringTrue_WhenMatchesIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char c = 'b';
        boolean match = reader.matchesIgnoreCase(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

}