package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testBlankText() {
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testSingleCharBlank() {
        TextNode node = new TextNode(":");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testMultipleCharsBlank() {
        TextNode node = new TextNode("Hello,  ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testNoWhitespace() {
        TextNode node = new TextNode("Hello");
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testSingleCharWhitespace() {
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testMultipleCharsWhitespace() {
        TextNode node = new TextNode("Hello  ");
        Assert.assertTrue(node.isBlank());
        Assert.assertFalse(node.isBlank());
    }

    @Test
    public void testNoIndent() {
        // Test case with no indent, which doesn't match any indentation rules.
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.getWholeText().trim()).isEmpty();
        Assert.assertFalse(node.getWholeText().trim()).isBlank();
    }

    @Test
    public void testIndentation() {
        // Test case with no indent, which doesn't match any indentation rules.
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.getWholeText().trim()).isEmpty();
        Assert.assertFalse(node.getWholeText().trim()).isBlank();
    }

    @Test
    public void testOffset() {
        // Test case with an offset of 0, which matches the specification.
        TextNode node = new TextNode("Hello");
        Assert.assertTrue(node.getWholeText().equals("Hello"));
        Assert.assertFalse(node.getWholeText().equals(""));
    }

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

    @Test
    public void testClone() {
        // Test case with a clone that contains identical text as the original node.
        TextNode original = new TextNode("Hello World");
        TextNode cloned = (TextNode) original.clone();
        Assert.assertTrue(cloned.getWholeText().equals(original.getWholeText()));
    }

}