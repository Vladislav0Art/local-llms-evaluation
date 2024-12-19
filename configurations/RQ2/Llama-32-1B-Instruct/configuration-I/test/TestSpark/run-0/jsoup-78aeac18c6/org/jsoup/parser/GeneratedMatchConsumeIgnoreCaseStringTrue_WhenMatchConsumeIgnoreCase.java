package org.jsoup.parser;

public class GeneratedMatchConsumeIgnoreCaseStringTrue_WhenMatchConsumeIgnoreCase {

    @Test
    public void matchConsumeIgnoreCaseStringTrue_WhenMatchConsumeIgnoreCase() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "Hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matchConsume(s, '\0'));

        assertEquals(3, sb.length());
    }

}