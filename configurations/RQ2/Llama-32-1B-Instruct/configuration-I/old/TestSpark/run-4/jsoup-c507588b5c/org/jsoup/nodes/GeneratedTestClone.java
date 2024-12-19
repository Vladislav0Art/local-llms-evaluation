package org.jsoup.nodes;

public class GeneratedTestClone {

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
    public void testClone() {
        TextNode node = new TextNode("");
        TextNode clone = (TextNode) node.clone();
        assertEquals(node, clone);
    }

}