package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

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
    public void testGetWholeText() {
        encodedText = "test text";
        TextNode node = createTextNode(encodedText);
        assertEquals("test text", node.getText());
    }

}