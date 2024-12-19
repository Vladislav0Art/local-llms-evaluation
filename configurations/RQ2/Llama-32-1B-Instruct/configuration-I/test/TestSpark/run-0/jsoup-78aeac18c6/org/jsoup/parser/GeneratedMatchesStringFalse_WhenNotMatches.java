package org.jsoup.parser;

public class GeneratedMatchesStringFalse_WhenNotMatches {

    @Test
    public void matchesStringFalse_WhenNotMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char c = 'b';
        boolean match = reader.matches(s, c);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

}