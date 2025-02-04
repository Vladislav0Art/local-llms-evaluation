package org.jsoup.nodes;

public class GeneratedTextNodeBlankness_test {

    @Test
    public void textNodeBlankness_test() {
        final TextNode node = new TextNode("");
        Assert.assertTrue(node.isBlank());
        final TextNode trimmedNode = new TextNode("   ");
        Assert.assertFalse(trimmedNode.isBlank());
    }

}