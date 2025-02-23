package org.jsoup.nodes;

public class GeneratedTestToString {

    private TextNode textNode;

    @Before
    public void setup() {
        textNode = new TextNode("Some text");
    }

    @Test
    public void testToString() {
        assertEquals("Some text", textNode.toString());
    }

}