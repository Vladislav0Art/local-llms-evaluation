package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceShouldReturnTrueForWhitespacesOnly {

    @Test
    public void lastCharIsWhitespaceShouldReturnTrueForWhitespacesOnly() {
        StringBuilder sb = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}