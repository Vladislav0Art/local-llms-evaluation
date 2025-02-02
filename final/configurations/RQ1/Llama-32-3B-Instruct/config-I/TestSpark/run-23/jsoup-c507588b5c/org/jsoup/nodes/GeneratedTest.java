package org.jsoup.nodes;

public class GeneratedTest {

    private String value;
    private int length;

    public TestNode() {
    }

    public boolean isBlank() {
        return false;
    }

    public String getValue() {
        return value;
    }
}

public class TextTest {
    @BeforeAll
    public static void setUp() {
        textNode = new TestNode();
        tailNode = new TestNode("Hello World!");
        accum = "   Hello World!";
    }

    private static TestNode textNode;
    private static TestNode tailNode;
    private static String accum;

    public static class Text {
        public static String getWholeText(TestNode node) {
            return node.getValue();
        }

        public static String text(TestNode node) {
            return node.getValue();
        }
    }

    @Test
    public void constructorTextNode_TextIsNotNull() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode.value);
    }

    @Test
    public void text_ReturnsTextContent() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", textNode.text());
    }

    @Test
    public void getWholeText_ReturnsWholeText() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

    @Test
    public void isBlank_TextIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

    @Test
    public void isBlank_IsNotBlank() {
        TextNode textNode = new TextNode("Hello World!");
        assertFalse(textNode.isBlank());
    }

    @Test
    public void splitText_SplitsAtOffset() throws IOException {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = 6;
        TextNode tailNode = textNode.splitText(offset);
        assertEquals(0, offset, tailNode.getWholeText().length());
    }

    @Test
    public void splitText_SplitOffsetIsNotValid() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        int offset = -1;
        assertFalse("Split offset must be not be negative", textNode.splitText(offset) != null);
    }

    @Test
    public void outerHtml_WithTrimming() throws IOException {
        String text = "   Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("Hello World!", accum.toString());
    }

    @Test
    public void outerHtml_WithoutTrimming() throws IOException {
        String text = "   Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals("   Hello World!", accum.toString());
    }

    @Test
    public void toString_ReturnsOuterHtml() throws IOException {
        String text = "Hello World!";
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode(text);
        textNode.outerHtmlHead(accum, 0, out);
        assertEquals(accum.toString(), textNode.toString());
    }

    @Test
    public void clone_ReturnsClone() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        TextNode clonedTextNode = (TextNode) textNode.clone();
        assertNotNull(clonedTextNode);
    }

}