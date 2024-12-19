package org.jsoup.parser;

public class GeneratedConsumeToCharFalse_WhenNotConsumed {

    @Test
    public void consumeToCharFalse_WhenNotConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo(c);

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

}