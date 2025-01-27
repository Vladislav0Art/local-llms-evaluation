package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_SingleCharacterStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_SingleCharacterStringBuilder_ReturnsTrue() {
        StringBuilder builder = new StringBuilder("a");
        boolean expected = true;
        assertTrue(lastCharIsWhitespace(builder));
    }

}