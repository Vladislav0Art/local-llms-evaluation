package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_MultipleCharactersStringBuilder_ReturnsFalse {

    @Test
    public void lastCharIsWhitespace_MultipleCharactersStringBuilder_ReturnsFalse() {
        StringBuilder builder = new StringBuilder("ab");
        boolean expected = false;
        assertFalse(lastCharIsWhitespace(builder));
    }

}