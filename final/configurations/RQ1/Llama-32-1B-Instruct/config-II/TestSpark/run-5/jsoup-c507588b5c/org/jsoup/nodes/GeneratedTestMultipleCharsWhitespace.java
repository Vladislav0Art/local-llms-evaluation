package org.jsoup.nodes;

public class GeneratedTestMultipleCharsWhitespace {

    @Test
    public void testMultipleCharsWhitespace() {
        TextNode node = new TextNode("Hello  ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}