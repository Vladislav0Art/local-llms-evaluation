package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void [TextNode]

    nodeNameTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.nodeName());
    }

    @Test
    public void [TextNode]

    textTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
        assertEquals("Hello World", node.text(""));
    }

    @Test
    public void [TextNode]

    splitTextTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals(5, node.splitText(0).text().length());
        assertEquals(3, node.splitText(1).text().length());
    }

    @Test
    public void [TextNode]

    isBlankTest() {
        TextNode node = new TextNode("   Hello World  ");
        assertTrue(node.isBlank());
    }

    @Test
    public void [TextNode]

    outerHtmlHeadTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        node.outerHtmlHead(new StringBuilder(), 0, Document.OutputSettings());
        // Add mock implementation for innerHtml method to be tested later
    }

    @Test
    public void [TextNode]

    outerHtmlTailTest() throws IOException {
        TextNode node = new TextNode("Hello World");
        node.outerHtmlTail(new StringBuilder(), 0, Document.OutputSettings());
        // Add mock implementation for innerHtml method to be tested later
    }

    @Test
    public void [TextNode]

    toStringTest() {
        TextNode node = new TextNode("Hello World");
        assertEquals("<p>Hello World</p>", node.toString());
    }

    @Test
    public void [TextNode]

    cloneTest() {
        TextNode node1 = new TextNode("Hello World");
        TextNode node2 = (TextNode) node.clone();
        // Add mock implementation for clone method to be tested later
    }

    @Test
    public void [TextNode]

    createFromEncodedTest() {
        String encodedText = "Hello World";
        TextNode node = TextNode.createFromEncoded(encodedText);
        assertEquals("Hello World", node.text());
    }

    @Test
    public void [TextNode]

    normaliseWhitespaceTest() {
        String text = "   Hello World  ";
        assertEquals("Hello World ", Normaliser.normaliseWhitespace(text));
    }

    @Test
    public void [TextNode]

    stripLeadingWhitespaceTest() {
        String text = "   Hello World  ";
        assertEquals("Hello World", stripLeadingWhitespace(text));
    }

    @Test
    public void [TextNode]

    lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb));
    }

}