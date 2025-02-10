package org.jsoup.nodes;

public class GeneratedTestMultipleCharsBlank {

    @Test
    public void testMultipleCharsBlank() {
        TextNode node = new TextNode("Hello,  ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}