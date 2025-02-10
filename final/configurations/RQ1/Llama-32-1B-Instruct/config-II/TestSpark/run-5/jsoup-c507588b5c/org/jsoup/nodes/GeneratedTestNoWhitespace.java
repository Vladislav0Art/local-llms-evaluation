package org.jsoup.nodes;

public class GeneratedTestNoWhitespace {

    @Test
    public void testNoWhitespace() {
        TextNode node = new TextNode("Hello");
        Assert.assertFalse(node.isBlank());
    }

}