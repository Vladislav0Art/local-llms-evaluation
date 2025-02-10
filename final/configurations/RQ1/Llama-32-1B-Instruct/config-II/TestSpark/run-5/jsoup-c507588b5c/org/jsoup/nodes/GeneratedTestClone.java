package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        // Test case with a clone that contains identical text as the original node.
        TextNode original = new TextNode("Hello World");
        TextNode cloned = (TextNode) original.clone();
        Assert.assertTrue(cloned.getWholeText().equals(original.getWholeText()));
    }

}