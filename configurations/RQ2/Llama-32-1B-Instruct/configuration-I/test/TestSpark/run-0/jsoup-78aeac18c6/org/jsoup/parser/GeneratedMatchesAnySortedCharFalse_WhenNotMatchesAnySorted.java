package org.jsoup.parser;

public class GeneratedMatchesAnySortedCharFalse_WhenNotMatchesAnySorted {

    @Test
    public void matchesAnySortedCharFalse_WhenNotMatchesAnySorted() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        boolean match = reader.matchesAnySorted(chars);

        assertFalse(match);

        assertTrue(reader.isTrackNewlines());
    }

}