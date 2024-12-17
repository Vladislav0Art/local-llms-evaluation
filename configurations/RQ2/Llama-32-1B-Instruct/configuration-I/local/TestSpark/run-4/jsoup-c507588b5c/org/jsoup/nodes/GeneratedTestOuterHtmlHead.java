package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

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
    public void testOuterHtmlHead() throws IOException {
        TextNode node = new TextNode("");
        outerHtmlHead(null, 0, null);
        assertEquals("", node.outerHtmlHead(0, null));
    }

}