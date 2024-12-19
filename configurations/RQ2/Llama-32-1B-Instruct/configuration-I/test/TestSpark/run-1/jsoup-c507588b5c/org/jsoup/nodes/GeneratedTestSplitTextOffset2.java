package org.jsoup.nodes;

public class GeneratedTestSplitTextOffset2 {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testSplitTextOffset2() {
        String result = node.splitText(-3);
        assertEquals("Hello World", result);
    }

}