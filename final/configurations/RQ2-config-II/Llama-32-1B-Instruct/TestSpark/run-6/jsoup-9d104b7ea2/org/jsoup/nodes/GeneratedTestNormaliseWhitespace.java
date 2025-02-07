package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testNormaliseWhitespace() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.normaliseWhitespace(""));
        assertEquals(expectedTexts[0], textNode.text());
    }

}