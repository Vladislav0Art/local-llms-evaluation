package org.jsoup.nodes;

public class GeneratedSplitTextWithOffsetAndTrimLeading {

    private static String inputText = "";

    @Test
    public void splitTextWithOffsetAndTrimLeading() {
        inputText = "<a>   <b>text  </b><c>another text</c>";
        TextNode node = new TextNode(splitText(3));
        assertEquals("<a><b>text</b></a>", node.text());
    }

}