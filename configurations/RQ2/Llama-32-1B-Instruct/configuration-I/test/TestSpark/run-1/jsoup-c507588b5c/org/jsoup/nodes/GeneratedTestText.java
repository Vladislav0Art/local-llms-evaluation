package org.jsoup.nodes;

public class GeneratedTestText {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testText() {
        assertEquals("Hello World", node.getText());
    }

}