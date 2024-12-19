package org.jsoup.parser;

public class GeneratedCloseTrue_WhenCloseIsCalled {

    @Test
    public void closeTrue_WhenCloseIsCalled() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.close();

        assertFalse(reader.isTrackNewlines());
    }

}