package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testGetWholeText() {
        assertEquals("Hello World", node.getWholeText());
    }

}