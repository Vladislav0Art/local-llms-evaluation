package org.jsoup.nodes;

public class GeneratedSplitTextWithOffsetAndTrimAndTrailing {

    private static String inputText = "";

    @Test
    public void splitTextWithOffsetAndTrimAndTrailing() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

}