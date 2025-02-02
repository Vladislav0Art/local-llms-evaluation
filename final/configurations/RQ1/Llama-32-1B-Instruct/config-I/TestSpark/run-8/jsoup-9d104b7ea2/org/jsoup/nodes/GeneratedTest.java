package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        assertFalse(TextNode.class.isInstance(new TextNode("")));
        assertFalse(TextNode.class.isInstance(new TextNode(null)));
        assertTrue(TextNode.class.isInstance(new TextNode()));
    }

    @Test
    public void testSplitText() throws IOException {
        String text = "   Hello World!  ";
        TextNode node = new TextNode(text);
        TextNode splitNode = node.splitText(5);
        assertEquals("Hello World!", splitNode.text());
    }

    @Test
    public void testOuterHtmlHead() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader("<p>Hello</p><span>World!</span></p>"));
        Appendable accum = new StringOutputStream();
        TextNode root = new TextNode("Hello World!");
        root.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint());
        assertEquals("<p>Hello <span>World!</span></p>", new String(accum.toString()));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new StringReader("<p>Hello</p><span>World!</span></p>"));
        Appendable accum = new StringOutputStream();
        TextNode root = new TextNode("Hello World!");
        root.outerHtmlTail(accum, 0, Document.OutputSettings.PrettyPrint());
        assertEquals("<p>Hello <span>World!</span></p>", new String(accum.toString()));
    }

    @Test
    public void testClone() {
        TextNode node1 = new TextNode("Hello World!");
        TextNode node2 = node1.clone();
        assertTrue(node1 == node2);
    }

}