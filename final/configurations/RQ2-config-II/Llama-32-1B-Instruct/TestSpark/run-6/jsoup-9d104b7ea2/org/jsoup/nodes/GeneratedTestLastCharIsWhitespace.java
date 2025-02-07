package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testLastCharIsWhitespace() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.lastCharIsWhitespace(new StringBuilder()));
        assertEquals(expectedTexts[0], textNode.text());
    }

}