package org.jsoup.nodes;

public class GeneratedSplitTextWithOffsetAndTrimAndTrailingAndLeading {

    private static String inputText = "";

    @Test
    public void splitTextWithOffsetAndTrimAndTrailingAndLeading() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(2));
        assertEquals("<a><b>text</b></a>", node.text());
    }

}