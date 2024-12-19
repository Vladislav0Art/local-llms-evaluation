package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testIsBlank() {
        TextNode node = new TextNode("   ");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World!");
        TextNode result = node.splitText(5);
        assertEquals("Hello", result.text());
        assertEquals(6, result.getWholeText().length());
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("   ");
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("test.html"));
        Appendable appendable = new StringBuilder();
        int depth = 0;
        OutputSettings out = new Document.OutputSettings();
        Node parentNode = null;

        TextNode node1 = new TextNode("<p>   </p>");
        node1.outerHtmlHead(appendable, depth, out);

        Assert.assertTrue(appendable.toString().contains("<span class=\"plain-text\">"));
    }

    @Test
    public void testOuterHtmlTail() {
        Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("test.html"));
        Appendable appendable = new StringBuilder();
        int depth = 0;
        OutputSettings out = new Document.OutputSettings();

        TextNode node1 = new TextNode("<p>   </p>");
        node1.outerHtmlTail(appendable, depth, out);

        Assert.assertFalse(appendable.toString().contains("  "));
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "Hello World!";
        assertEquals("Hello World!", normaliseWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() {
        StringBuilder sb = new StringBuilder();
        sb.append("   ");
        assertEquals(4, stripLeadingWhitespace(sb.toString()));
    }

}