package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testTextNodeName() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("text", node.nodeName());
    }

    @Test
    public void testTextNodeText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void testTextNodeTextWithBlank() {
        TextNode node = new TextNode("Hello ");
        assertEquals(" ", node.text());
    }

    @Test
    public void testTextNodeGetWholeText() {
        TextNode node = new TextNode("Hello, World!");
        String wholeText = node.getWholeText();
        assertEquals("Hello, World!", wholeText);
    }

    @Test
    public void testTextNodeIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testTextNodeSplitText() {
        TextNode node = new TextNode("Hello ");
        String splitText = node.splitText(4);
        assertEquals("", splitText);
    }

    @Test
    public void testTextNodeOuterHtmlHead() {
        Document document = Document.createDocumentBuilder();
        Appendable accum = document.out;
        int depth = 0;
        TextNode root = new TextNode("Hello, World!");
        root.outerHtmlHead(accum, depth, Document.OutputSettings.INDENT_NO_SPACE);
        assertEquals("  Hello, World!", root.outerHtmlHead(accum, depth, Document.OutputSettings.INDENT_NO_SPACE));
    }

    @Test
    public void testTextNodeOuterHtmlTail() {
        Document document = Document.createDocumentBuilder();
        Appendable accum = document.out;
        int depth = 0;
        TextNode root = new TextNode("Hello ");
        root.outerHtmlTail(accum, depth, Document.OutputSettings.INDENT_NO_SPACE);
        assertEquals("", root.outerHtmlTail(accum, depth, Document.OutputSettings.INDENT_NO_SPACE));
    }

    @Test
    public void testTextNodeToString() {
        TextNode node = new TextNode("Hello");
        String string = node.toString();
        assertEquals("\"Hello\"", string);
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello");
        TextNode clone = (TextNode) node1.clone();
        assertEquals(node1, clone);
    }

    @Test
    public void testCreateFromEncoded() {
        String encodedText = "Hello";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello", textNode.text());
    }

}