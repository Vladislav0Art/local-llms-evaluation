package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb1 = new StringBuilder("\t");
        assertTrue(TextNode.lastCharIsWhitespace(sb1));

        StringBuilder sb2 = new StringBuilder(" ");
        assertTrue(TextNode.lastCharIsWhitespace(sb2));
        assertFalse(TextNode.lastCharIsWhitespace(sb2, 0));

        StringBuilder sb3 = new StringBuilder("");
        assertFalse(TextNode.lastCharIsWhitespace(sb3));
    }

}