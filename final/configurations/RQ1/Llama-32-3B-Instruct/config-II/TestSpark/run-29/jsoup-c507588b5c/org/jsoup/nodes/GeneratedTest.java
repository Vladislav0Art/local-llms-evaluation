package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeFromTextCreatesNewTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void newNodeFromEmptyTextCreatesBlankTextNode() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void newNodeFromEncodedDataCreatesNewTextNodeWithUnescapedText() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

    @Test
    public void normalisedWhitespaceRemovesExtraSpaces() {
        String text = "   Hello   World  ";
        assertEquals("Hello World", TextNode.normaliseWhitespace(text));
    }

    @Test
    public void splitTextCreatesNewTextNodeWithProperOffset() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        TextNode tailNode = textNode.splitText(6);
        assertEquals("World", tailNode.text());
        assertTrue(tailNode.isBlank());
    }

    @Test
    public void splitTextHandlesNegativeOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(-1);
        assertNotNull(result);
        assertEquals("", result.text());
    }

    @Test
    public void splitTextHandlesOffsetGreater

    Than TextLength() {
        TextNode textNode = new TextNode("Hello World");
        TextNode result = textNode.splitText(10);
        assertNotNull(result);
        assertEquals("", result.text());
    }

    @Test
    public void outerHtmlHeadHandlesBlankTextNodeProperly() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("");
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTailDoesNothing() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("Hello World");
        textNode.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneCreatesNewTextNodeWithSameText() {
        TextNode textNode = new TextNode("Hello World");
        TextNode cloned = textNode.clone();
        assertEquals("#text", cloned.nodeName());
        assertEquals(textNode.text(), cloned.text());
    }

    @Test
    public void toStringReturnsOuterHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings(true, false);
        TextNode textNode = new TextNode("Hello World");
        String outerHTML = textNode.outerHtml();
        assertEquals(outerHTML, textNode.toString());
    }

}