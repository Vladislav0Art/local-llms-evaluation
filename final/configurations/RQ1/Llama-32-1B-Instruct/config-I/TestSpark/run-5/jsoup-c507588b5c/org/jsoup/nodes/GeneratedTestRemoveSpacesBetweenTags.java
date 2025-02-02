package org.jsoup.nodes;

public class GeneratedTestRemoveSpacesBetweenTags {

    @Test
    public void testRemoveSpacesBetweenTags() {
        String text = "<p>Hello <span>World!</span></p>";
        TextNode node = new TextNode(text);
        assertEquals("<p>Hello World!</p>", node.toString());
    }

}