package org.jsoup.parser;

public class GeneratedTrackNewlinesTrue_WhenTrackNewlinesIsTrue {

    @Test
    public void trackNewlinesTrue_WhenTrackNewlinesIsTrue() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.trackNewlines(true);

        assertEquals(1, reader.pos());
        assertTrue(reader.isTrackNewlines());
    }

}