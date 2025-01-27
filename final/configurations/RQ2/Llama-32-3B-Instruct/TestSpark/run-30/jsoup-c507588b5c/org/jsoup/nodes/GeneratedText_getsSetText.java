package org.jsoup.nodes;

public class GeneratedText_getsSetText {

    @Test
    public void text_getsSetText() {
        TextNode node = new TextNode();
        node.text("new text");
        Assert.assertEquals("new text", node.text());
    }

}