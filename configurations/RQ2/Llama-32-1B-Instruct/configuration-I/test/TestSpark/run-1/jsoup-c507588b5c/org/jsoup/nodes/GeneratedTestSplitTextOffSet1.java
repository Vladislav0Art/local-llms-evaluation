package org.jsoup.nodes;

public class GeneratedTestSplitTextOffSet1 {

    private TextNode node;

    @Before
    public void setup() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testSplitTextOffSet1() {
        String result = node.splitText(0);
        assertEquals("", result);
    }

}