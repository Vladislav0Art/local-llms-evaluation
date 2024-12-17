package org.jsoup.nodes;

public class GeneratedTestClone {

    private final String value;

    public TextNodeImpl(String text) {
        super(text);
        this.value = StringUtil.normaliseWhitespace(getWholeText());
    }

    @Override
    public String nodeName() {
        return "#text";
    }
}

public class TextNodeTests {

    @Test
    public void testClone() {
        TextNodeImpl node = new TextNodeImpl("<p>Hello, World!</p>");
        TextNode clonedNode = node.clone();

        // When the method is called on a TextNode
        cloneTest(clonedNode);

        // Then the cloned node should be identical to the original node
        assertEquals(node, clonedNode);
    }

    private void outerHtmlHeadTest(String expectedOutput, Document doc, Document.OutputSettings out) {
        Assert.assertTrue(doc.toString().startsWith(expectedOutput));
    }

    private void outerHtmlTailTest(String expectedOutput, Document doc, Document.OutputSettings out) {
        Assert.assertTrue(doc.toString().endsWith(expectedOutput));
    }

}