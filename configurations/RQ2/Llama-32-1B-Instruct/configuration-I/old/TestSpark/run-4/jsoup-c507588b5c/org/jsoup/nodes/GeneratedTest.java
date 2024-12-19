package org.jsoup.nodes;

public class GeneratedTest {

    private String encodedText;

    @Mock
    private Appendable accumulator;
    @Mock
    private Document.OutputSettings outputSettings;

    @Before
    public void setup() {
        mockOutputSettings();
    }

    public static TextNode createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testBlankNode() {
        TextNode node = new TextNode("");
        assertEquals("text is blank", TextNode.isBlank(node));
    }

    @Test
    public void testGetWholeText() {
        encodedText = "test text";
        TextNode node = createTextNode(encodedText);
        assertEquals("test text", node.getText());
    }

    @Test
    public void testSplitText() {
        encodedText = "test text";
        TextNode node1 = createTextNode("");
        TextNode node2 = createTextNode(encodedText.substring(0, 10));
        TextNode splitNode = node1.splitText(5);
        assertEquals("test", splitNode.getText());
        assertEquals("", splitNode.getWholeText());
    }

    public static void mockOutputSettings() {
        outputSettings = new Document.OutputSettings();
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode node = new TextNode("");
        outerHtmlHead(null, 0, null);
        assertEquals("", node.outerHtmlHead(0, null));
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        TextNode node = new TextNode("");
        outerHtmlTail(null, 0, null);
        assertEquals("", node.outerHtmlTail(0, null));
    }

    @Test
    public void testToString() {
        TextNode node = new TextNode("");
        assertEquals("text", node.toString());
    }

    @Test
    public void testClone() {
        TextNode node = new TextNode("");
        TextNode clone = (TextNode) node.clone();
        assertEquals(node, clone);
    }

}