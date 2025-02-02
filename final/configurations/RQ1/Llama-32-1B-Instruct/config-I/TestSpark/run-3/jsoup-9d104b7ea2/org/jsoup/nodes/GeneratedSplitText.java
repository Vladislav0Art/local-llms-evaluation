package org.jsoup.nodes;

public class GeneratedSplitText {

    private static String inputText = "";

    @Test
    public void splitText() {
        inputText = "<a>   <b>text</b> </a>";
        TextNode node = new TextNode(splitText(0));
        assertEquals("<a><b>text</b></a>", node.text());
    }

}