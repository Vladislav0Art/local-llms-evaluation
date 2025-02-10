package org.jsoup.nodes;

public class GeneratedTestBlankText {

    @Test
    public void testBlankText() {
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

}