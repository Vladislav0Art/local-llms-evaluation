package org.jsoup.parser;

public class GeneratedMatchConsumeTrue_WhenMatchConsume {

    @Test
    public void matchConsumeTrue_WhenMatchConsume() {
        CharacterReader reader = new CharacterReader(new Reader(), 10);
        String s = "hello";
        char[] chars = {'b', 'c'};
        StringBuilder sb = new StringBuilder();
        reader.consumeTo(sb);

        assertTrue(reader.matchConsume(s, '\0'));

        assertEquals(3, sb.length());
    }

}