package org.jsoup.nodes;

public class GeneratedTextUpdatesNodeWithNewText {

    @Test
    public void textUpdatesNodeWithNewText() {
        TextNode node = new MockTextNode("old");
        node = node.text("new");
        assertEquals("new", node.text());
    }

}