package org.jsoup.parser;

public class GeneratedMatchesConsumeStringTrue_WhenMatches {

    @Test
    public void matchesConsumeStringTrue_WhenMatches() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matches(s, '\0'));

        assertEquals(3, sb.length());
    }

}