package org.jsoup.nodes;

public class GeneratedTest {

    private TextNode node;
    private Document document;

    @Test
    public void testnodeName() {
        String expected = "Text";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.nodeName());
    }

    @Test
    public void testText() {
        String expected = "Hello, World!";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.text());
    }

    @Test
    public void testTextFromEncoded() {
        String encodedText = "Hello, World!";
        node = TextNode.createFromEncoded(encodedText);
        assertEquals(node.text(), "Hello, World!");
    }

    @Before
    public void setupDocument() {
        document = new Document();
        document.createElement("p").appendText("Hello, World!");
    }

    @Test
    public void testGetWholeText() {
        String expected = "Hello, World!";
        node = new TextNode("Hello, World!");
        assertEquals(expected, node.getWholeText());
    }

    @Test
    public void testIsBlank() {
        node = new TextNode("");
        assertTrue(node.isBlank());
    }

    @Test
    public void testSplitText() {
        String text = "Hello";
        node = new TextNode(text);
        assertEquals(2, node.splitText(0));
        assertEquals("Hello", node.getWholeText());
    }

    @Before
    public void setupDocument() {
        document = new Document();
        for (int i = 0; i < 100; i++) {
            node = document.createElement("p").appendText(String.valueOf(i));
            if (i % 10 == 0) {
                node = document.createSpan().appendText(" ");
            }
        }
    }

    @Test
    public void testToString() {
        String expected = "Hello, World!";
        assertEquals(expected, node.toString());
    }

    @Test
    public void testClone() {
        TextNode cloned = (TextNode) node.clone();
        assertEquals(node, cloned);
    }

    @Test
    public void testNormaliseWhitespace() {
        String text = "   Hello   World!   ";
        node = new TextNode(text);
        assertEquals("Hello World", normaliseWhitespace(text));
    }

    @Test
    public void testStripLeadingWhitespace() {
        String text = "   Hello   World!   ";
        node = new TextNode(text);
        assertEquals(13, text.length());
        assertEquals("Hello World!", stripLeadingWhitespace(text));
    }

    @Test
    public void testLastCharIsWhitespace() {
        String text = "Hello";
        node = new TextNode(text);
        assertTrue(lastCharIsWhitespace(node.toString()));
    }

}