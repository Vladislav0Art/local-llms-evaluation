package org.jsoup.nodes;

public class GeneratedTestSplitText {

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

}