package org.jsoup.nodes;

public class GeneratedTextNodeSet_text_test {

    @Test
    public void textNodeSet_text_test() {
        final TextNode node = new TextNode();
        node.text("Hello World");
        Assert.assertEquals("Hello World", node.text());
    }

}