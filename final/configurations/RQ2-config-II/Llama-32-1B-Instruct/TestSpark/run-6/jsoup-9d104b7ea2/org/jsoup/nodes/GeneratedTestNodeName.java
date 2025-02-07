package org.jsoup.nodes;

public class GeneratedTestNodeName {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testNodeName() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.nodeName());
        assertEquals(expectedTexts[0], textNode.text());
    }

}