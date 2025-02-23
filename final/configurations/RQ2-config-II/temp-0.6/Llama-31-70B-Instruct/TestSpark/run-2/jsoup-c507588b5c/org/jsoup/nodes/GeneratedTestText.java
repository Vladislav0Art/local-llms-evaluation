package org.jsoup.nodes;

public class GeneratedTestText {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testText() {
        assertEquals("Some text", textNode.text());
    }

}