package org.jsoup.nodes;

public class GeneratedTest {

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
    public void testIsBlank() {
        assertFalse(TextNodeImpl.isBlank("   "));
        assertFalse(TextNodeImpl.isBlank(""));
        assertFalse(TextNodeImpl.isBlank(null));
    }

    @Test
    public void testText() {
        assertEquals("", TextNodeImpl.getText());
        assertEquals("<p>Hello, World!</p>", TextNodeImpl.getText("Hello, World!"));
    }

    @Test
    public void testTextSet() {
        TextNodeImpl text = new TextNodeImpl("   Hello");
        assertEquals("<p>Hello</p>", text.getText());
    }

    @Test
    public void testSplitText() {
        String originalText = "<hello world";
        TextNodeImpl text1 = new TextNodeImpl(originalText.substring(0, 2));
        TextNodeImpl text2 = new TextNodeImpl(originalText.substring(5));

        TextNodeImpl result = TextNode.text(text1).splitText(3);
        assertEquals("Hello", result.getText());
    }

    @Test
    public void testOuterHtmlHead() {
        // Given a document with a root element
        Document doc = MockDocument.create();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.INDENT_NO_NEWLINE;

        TextNodeImpl node = new TextNodeImpl("<p>Hello, World!</p>");
        node.outerHtmlHead(accum, depth, out);

        // When the method is called
        outerHtmlHeadTest(accum.toString(), doc, out);

        // Then the result should have been indented correctly
        assertEquals("Hello\nWorld!", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Document doc = MockDocument.create();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.INDENT_NO_NEWLINE;

        // When the method is called without a tail node
        outerHtmlTailTest(accum.toString(), doc, out);

        // Then the result should have been cleared
        assertEquals("Hello\nWorld!", accum.toString());
    }

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