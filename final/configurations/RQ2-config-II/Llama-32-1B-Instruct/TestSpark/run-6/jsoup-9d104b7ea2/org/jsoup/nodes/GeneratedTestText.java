package org.jsoup.nodes;

public class GeneratedTestText {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testText() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"test", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[1], textNode.text());
        assertEquals(expectedTexts[1], textNode.text());
    }

}