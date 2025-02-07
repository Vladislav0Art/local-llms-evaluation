package org.jsoup.nodes;

public class GeneratedTestCreateFromEncoded {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testCreateFromEncoded() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        assertEquals(nodeNames[0], textNode.createFromEncoded(""));
        assertEquals(expectedTexts[0], textNode.getWholeText());
    }

}