package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testGetWholeText() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.getWholeText());
        assertEquals(expectedTexts[0], textNode.getWholeText());
    }

}