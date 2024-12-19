package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() throws IOException {
        TextNode node = new TextNode("");
        outerHtmlTail(null, 0, null);
        assertEquals("", node.outerHtmlTail(0, null));
    }

}