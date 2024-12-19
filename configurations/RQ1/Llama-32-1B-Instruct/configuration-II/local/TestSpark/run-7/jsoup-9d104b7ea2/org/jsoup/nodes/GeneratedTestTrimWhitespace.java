package org.jsoup.nodes;

public class GeneratedTestTrimWhitespace {

    @Test
    public void testTrimWhitespace() {
        String text = "   Hello World!";
        TextNode node = new TextNode(text);
        assertTrue(node.stripLeadingWhitespace().trim());
    }

}