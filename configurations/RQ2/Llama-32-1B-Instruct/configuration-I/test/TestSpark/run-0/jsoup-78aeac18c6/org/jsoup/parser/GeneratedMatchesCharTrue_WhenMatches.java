package org.jsoup.parser;

public class GeneratedMatchesCharTrue_WhenMatches {

    @Test
    public void matchesCharTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        boolean match = reader.matches(c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

}