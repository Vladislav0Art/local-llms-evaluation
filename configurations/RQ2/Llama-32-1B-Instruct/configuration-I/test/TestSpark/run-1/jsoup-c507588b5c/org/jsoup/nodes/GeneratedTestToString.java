package org.jsoup.nodes;

public class GeneratedTestToString {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testToString() {
        assertEquals("text", node.toString());
    }

}