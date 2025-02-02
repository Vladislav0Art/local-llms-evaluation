package org.jsoup.nodes;

public class GeneratedSplitTextWithOffsetAndTrim {

    private static String inputText = "";

    @Test
    public void splitTextWithOffsetAndTrim() {
        inputText = "<a>   <b>text  </b><c>another text  </c>";
        TextNode node = new TextNode(splitText(6));
        assertEquals("<a><b>text</b></a>", node.text());
    }

}