package org.jsoup.nodes;

public class GeneratedTestOffset {

    @Test
    public void testOffset() {
        // Test case with an offset of 0, which matches the specification.
        TextNode node = new TextNode("Hello");
        Assert.assertTrue(node.getWholeText().equals("Hello"));
        Assert.assertFalse(node.getWholeText().equals(""));
    }

}