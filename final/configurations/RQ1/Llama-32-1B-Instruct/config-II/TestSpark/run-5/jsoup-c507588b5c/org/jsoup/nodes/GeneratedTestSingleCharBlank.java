package org.jsoup.nodes;

public class GeneratedTestSingleCharBlank {

    @Test
    public void testSingleCharBlank() {
        TextNode node = new TextNode(":");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}