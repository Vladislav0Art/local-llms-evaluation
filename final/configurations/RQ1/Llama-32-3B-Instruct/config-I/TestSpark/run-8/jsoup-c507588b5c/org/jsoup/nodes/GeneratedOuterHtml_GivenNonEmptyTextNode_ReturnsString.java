package org.jsoup.nodes;

public class GeneratedOuterHtml_GivenNonEmptyTextNode_ReturnsString {

    @Test
    public void outerHtml_GivenNonEmptyTextNode_ReturnsString() {
        String text = "test";
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode(text);
        node.outerHtmlHead(accum, depth, out);
        verify(accum).append(eq("t")); // assuming append returns void
    }

}