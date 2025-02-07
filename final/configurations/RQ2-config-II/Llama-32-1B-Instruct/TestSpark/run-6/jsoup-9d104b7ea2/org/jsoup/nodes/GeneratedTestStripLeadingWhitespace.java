package org.jsoup.nodes;

public class GeneratedTestStripLeadingWhitespace {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testStripLeadingWhitespace() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"test", ""};
        textNode = new TextNode("  test  ");
        assertEquals(nodeNames[0], textNode.stripLeadingWhitespace(""));
        assertEquals(expectedTexts[0], textNode.text());
    }

}