package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Some text", textNode.getWholeText());
    }

}