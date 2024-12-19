package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newNodeFromText_CreatesTextNode() {
        TextNode node = new TextNode("Hello, World!");
        assertNotNull(node);
    }

    @Test
    public void newNodeFromEncodedCreatesTextNodeCorrectly() {
        String encodedText = "&lt;Hello&gt; &amp; World! &lt;";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void textReturnsUnencodedText() {
        TextNode node = new TextNode("Hello, World!");
        assertEquals("Hello, World!", node.text());
    }

    @Test
    public void isBlankReturnsTrueIfEmptyOrWhitespace() {
        TextNode node1 = new TextNode("");
        assertTrue(node1.isBlank());

        TextNode node2 = new TextNode("\t");
        assertTrue(node2.isBlank());

        TextNode node3 = new TextNode("   ");
        assertTrue(node3.isBlank());
    }

    @Test
    public void isBlankReturnsFalseIfNotEmpty() {
        TextNode node = new TextNode("Hello, World!");
        assertFalse(node.isBlank());
    }

    @Test
    public void splitTextCreatesNewTextNodeCorrectly() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertEquals("World!", tailNode.text());
    }

    @Test
    public void splitTextReturnsTextNodeWithCorrectText() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        int offset = 6;
        TextNode tailNode = node.splitText(offset);
        assertEquals(node.nodeName(), tailNode.nodeName());
    }

    @Test
    public void outerHtmlHeadIncludesTrailingWhitespace() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        Appendable accum = htmlBuilder;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode node = new TextNode("   ");
        node.outerHtmlHead(accum, 0, out);
        assertTrue(htmlBuilder.toString().contains("&nbsp;"));
    }

    @Test
    public void outerHtmlIncludesEntityEscapes() throws IOException {
        StringBuilder htmlBuilder = new StringBuilder();
        Appendable accum = htmlBuilder;
        Document.OutputSettings out = new Document.OutputSettings(true, true);
        TextNode node = new TextNode("Hello, &amp; World!");
        node.outerHtmlHead(accum, 0, out);
        assertTrue(htmlBuilder.toString().contains("&amp;"));
    }

}