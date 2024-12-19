package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testIsBlank() {
        assertTrue(node.isBlank());
    }

}