package org.jsoup.nodes;

public class GeneratedText_setText_test {

    @Test
    public void text_setText_test() {
        TextNode node = new TextNode("Hello");
        node.text("New Hello");
        assertEquals("New Hello", node.text());
    }

}