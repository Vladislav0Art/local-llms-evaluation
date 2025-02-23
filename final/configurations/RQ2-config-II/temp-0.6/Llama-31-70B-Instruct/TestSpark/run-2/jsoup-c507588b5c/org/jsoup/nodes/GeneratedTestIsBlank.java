package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testIsBlank() {
        assertFalse(textNode.isBlank());
    }

}