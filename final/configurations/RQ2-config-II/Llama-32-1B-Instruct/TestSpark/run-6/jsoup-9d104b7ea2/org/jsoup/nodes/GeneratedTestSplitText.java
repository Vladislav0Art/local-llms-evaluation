package org.jsoup.nodes;

public class GeneratedTestSplitText {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testSplitText() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.splitText(0));
        assertEquals(expectedTexts[0], textNode.getWholeText());
    }

}