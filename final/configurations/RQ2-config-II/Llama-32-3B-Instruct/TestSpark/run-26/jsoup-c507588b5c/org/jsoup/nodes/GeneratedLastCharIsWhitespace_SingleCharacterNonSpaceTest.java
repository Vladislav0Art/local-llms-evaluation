package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_SingleCharacterNonSpaceTest {

    @Test
    public void lastCharIsWhitespace_SingleCharacterNonSpaceTest() {
        char[] buffer = {'!'};
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder(buffer)));
    }

}