package org.jsoup.parser;

public class GeneratedConsumeToShortStringTrue_WhenConsumed {

    @Test
    public void consumeToShortStringTrue_WhenConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo('a');

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

}