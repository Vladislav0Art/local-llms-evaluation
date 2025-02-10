package org.jsoup.nodes;

public class GeneratedTestNoIndent {

    @Test
    public void testNoIndent() {
        // Test case with no indent, which doesn't match any indentation rules.
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.getWholeText().trim()).isEmpty();
        Assert.assertFalse(node.getWholeText().trim()).isBlank();
    }

}