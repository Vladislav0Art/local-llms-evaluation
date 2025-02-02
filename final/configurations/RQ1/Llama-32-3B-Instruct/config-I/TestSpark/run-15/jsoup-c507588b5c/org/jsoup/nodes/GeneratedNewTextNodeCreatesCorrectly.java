package org.jsoup.nodes;

public class GeneratedNewTextNodeCreatesCorrectly {

    private static final String BLANK_TEXT = "\n\n";
    private static final int OFFSET_1 = 5;
    private static final int OFFSET_2 = 10;

    @Test
    public void newTextNodeCreatesCorrectly() {
        TextNode textNode = new TextNode(BLANK_TEXT);
        Assert.assertEquals("#text", textNode.nodeName());
    }

}