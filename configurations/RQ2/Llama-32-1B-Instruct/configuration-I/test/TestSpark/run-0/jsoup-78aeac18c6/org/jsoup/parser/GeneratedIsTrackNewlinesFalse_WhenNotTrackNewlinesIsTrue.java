package org.jsoup.parser;

public class GeneratedIsTrackNewlinesFalse_WhenNotTrackNewlinesIsTrue {

    @Test
    public void isTrackNewlinesFalse_WhenNotTrackNewlinesIsTrue() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.trackNewlines(false);

        assertTrue(reader.isTrackNewlines());
    }

}