package org.jsoup.nodes;

public class GeneratedTestToString {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testToString() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.toString());
        assertEquals(expectedTexts[0], textNode.toString());
    }

}