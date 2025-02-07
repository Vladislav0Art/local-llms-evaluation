package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    private TextNode textNode;
    private String[] nodeNames;
    private String[] expectedTexts;

    @Test
    public void testOuterHtmlTail() {
        nodeNames = new String[]{"TextNode", "DocumentTextNode"};
        expectedTexts = new String[]{"", ""};
        textNode = new TextNode("test");
        textNode.outerHtmlTail(new java.util.ArrayList<>(), 1, org.jsoup.helpers.OutputSettings.OUTPUT_TYPE_STRING);
    }

}