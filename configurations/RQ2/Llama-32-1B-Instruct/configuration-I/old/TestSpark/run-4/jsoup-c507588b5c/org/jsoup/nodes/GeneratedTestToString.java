package org.jsoup.nodes;

public class GeneratedTestToString {

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
    public void testToString() {
        TextNode node = new TextNode("");
        assertEquals("text", node.toString());
    }

}