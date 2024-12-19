package org.jsoup.parser;

public class GeneratedMatchesAsciiAlphaTrue_WhenMatches {

    @Test
    public void matchesAsciiAlphaTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = 'a';
        boolean match = reader.matches(s, c);

        assertTrue(match);

        assertTrue(reader.isTrackNewlines());
    }

}