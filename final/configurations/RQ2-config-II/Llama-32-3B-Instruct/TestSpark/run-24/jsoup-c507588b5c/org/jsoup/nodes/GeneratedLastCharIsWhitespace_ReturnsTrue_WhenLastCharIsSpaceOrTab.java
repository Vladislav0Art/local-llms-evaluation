package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_ReturnsTrue_WhenLastCharIsSpaceOrTab {

    @Test
    public void lastCharIsWhitespace_ReturnsTrue_WhenLastCharIsSpaceOrTab() {
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Hello\tWorld")));
        assertTrue(TextNode.lastCharIsWhitespace(new StringBuilder("Hello \nWorld")));
    }

}