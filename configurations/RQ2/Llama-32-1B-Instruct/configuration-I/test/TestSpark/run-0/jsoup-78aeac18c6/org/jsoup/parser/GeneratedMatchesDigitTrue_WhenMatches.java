package org.jsoup.parser;

public class GeneratedMatchesDigitTrue_WhenMatches {

    @Test
    public void matchesDigitTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = '1';
        boolean match = reader.matches(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

}