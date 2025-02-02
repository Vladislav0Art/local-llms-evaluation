package org.jsoup.nodes;

public class GeneratedOuterHtml_GivenEmptyTextNode_ReturnsString {

    @Test
    public void outerHtml_GivenEmptyTextNode_ReturnsString() {
        String text = "";
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode(text);
        node.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq("")); // assuming append returns void
    }

}