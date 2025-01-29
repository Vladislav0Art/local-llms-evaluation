package org.jsoup.nodes;

public class GeneratedTest {

    private LeafNode leafNode;

    @Before
    public void setup() throws IOException {
        Document document = new Document();
        Appendable appendable = document.append("Hello World!");
        leafNode = TextNode.createFromEncoded(toString(appendable));
    }

    @Test
    public void testnodeName() {
        assertEquals("text", leafNode.nodeName());
    }

    @Test
    public void testText() {
        assertEquals("Hello World!", leafNode.text().trim());
    }

    @Test
    public void testTextFromEncoded() {
        String encodedText = "Hello World!";
        TextNode createdTextNode = TextNode.createFromEncoded(encodedText);
        assertEquals(leafNode, createdTextNode);
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Hello World!", leafNode.getWholeText());
    }

    @Test
    public void testIsBlank() {
        assertTrue(leafNode.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Hello";
        TextNode splitTextNode = (TextNode) leafNode.splitText(0);
        assertEquals("Hello", splitTextNode.text().trim());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder appendableBuilder = new StringBuilder();
        outerHtmlHead(appendableBuilder, 1, Document.OutputSettings.FORWARD);
        assertEquals("<html><head></head>", toString(appendableBuilder.toString()));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        StringBuilder appendableBuilder = new StringBuilder();
        outerHtmlTail(appendableBuilder, 1, Document.OutputSettings.FORWARD);
        assertEquals("<html><head></head></body></html>", toString(appendableBuilder.toString()));
    }

    @Test
    public void testToString() {
        assertEquals("text", leafNode.toString());
    }

}