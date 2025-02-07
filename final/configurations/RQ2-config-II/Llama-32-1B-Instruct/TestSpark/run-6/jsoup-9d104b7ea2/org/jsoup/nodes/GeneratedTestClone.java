package org.jsoup.nodes;

public class GeneratedTestClone {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testClone() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        TextNode cloned = (TextNode) textNode.clone();
        assertEquals(nodeNames[0], cloned.nodeName());
        assertEquals(expectedTexts[0], cloned.text());
    }

}