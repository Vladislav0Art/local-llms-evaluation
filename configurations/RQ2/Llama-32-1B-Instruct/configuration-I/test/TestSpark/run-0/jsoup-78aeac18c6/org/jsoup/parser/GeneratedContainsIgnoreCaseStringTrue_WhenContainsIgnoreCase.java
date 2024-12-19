package org.jsoup.parser;

public class GeneratedContainsIgnoreCaseStringTrue_WhenContainsIgnoreCase {

    @Test
    public void containsIgnoreCaseStringTrue_WhenContainsIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.containsIgnoreCase(s, '\0'));

        assertEquals(3, sb.length());
    }

}