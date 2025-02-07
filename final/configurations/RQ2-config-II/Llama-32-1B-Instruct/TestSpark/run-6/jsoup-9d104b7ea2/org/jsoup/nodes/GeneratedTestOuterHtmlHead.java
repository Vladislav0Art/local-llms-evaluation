package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testOuterHtmlHead() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        textNode.outerHtmlHead(new java.util.ArrayList<>(), 1, org.jsoup.helpers.OutputSettings.OUTPUT_TYPE_STRING);
    }

}