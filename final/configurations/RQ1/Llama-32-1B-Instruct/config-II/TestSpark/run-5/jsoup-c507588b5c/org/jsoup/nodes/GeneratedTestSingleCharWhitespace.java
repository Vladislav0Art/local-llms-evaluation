package org.jsoup.nodes;

public class GeneratedTestSingleCharWhitespace {

    @Test
    public void testSingleCharWhitespace() {
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}