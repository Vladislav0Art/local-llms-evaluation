package org.jsoup.parser;

public class GeneratedConsumeToNullStringTrue_WhenConsumed {

    @Test
    public void consumeToNullStringTrue_WhenConsumed() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        char c = 'a';
        String s = reader.consumeTo(null);

        assertEquals("a", s);

        assertTrue(reader.isTrackNewlines());
    }

}