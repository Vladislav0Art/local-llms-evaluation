package org.jsoup.parser;

public class GeneratedMatchesAnyCharFalse_WhenNotMatchesAny {

    @Test
    public void matchesAnyCharFalse_WhenNotMatchesAny() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        boolean match = reader.matchesAny(chars);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

}