package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testIsBlank() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", "", ""};
        textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}