package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String originalText = "Hello World";
        TextNode node = new TextNode(originalText);
        TextNode result1 = node.splitText(0); // Split at 0, which matches the specification.
        Assert.assertTrue(result1.getWholeText().equals("Hello"));
        Assert.assertFalse(result1.getWholeText().equals(""));

        TextNode node2 = new TextNode(originalText);
        TextNode result2 = node.splitText(7); // Split at offset of 8, which also matches the specification.
        Assert.assertTrue(result2.getWholeText().equals("World"));
        Assert.assertFalse(result2.getWholeText().equals(""));
    }

}