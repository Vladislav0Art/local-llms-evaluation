package org.jsoup.parser;

public class GeneratedIsEmptyTrue_WhenIsEmpty {

    @Test
    public void isEmptyTrue_WhenIsEmpty() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        reader.isEmpty();

        assertTrue(reader.isEmpty());

        reader.mark();
        assertFalse(reader.isEmpty());
    }

}