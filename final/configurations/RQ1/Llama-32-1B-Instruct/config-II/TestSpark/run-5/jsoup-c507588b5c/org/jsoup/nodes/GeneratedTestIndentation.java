package org.jsoup.nodes;

public class GeneratedTestIndentation {

    @Test
    public void testIndentation() {
        // Test case with no indent, which doesn't match any indentation rules.
        TextNode node = new TextNode("   ");
        Assert.assertTrue(node.getWholeText().trim()).isEmpty();
        Assert.assertFalse(node.getWholeText().trim()).isBlank();
    }

}