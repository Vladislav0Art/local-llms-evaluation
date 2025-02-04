package org.jsoup.nodes;

public class GeneratedTextNodeCreation_test {

    @Test
    public void textNodeCreation_test() {
        final TextNode node = new TextNode("Hello World");
        Assert.assertEquals("Hello World", node.text());
        Assert.assertEquals("#text", node.nodeName());
    }

}