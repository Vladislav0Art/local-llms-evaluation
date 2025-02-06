package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_tailElementNotSupported_test {

    @Test
    public void outerHtmlTail_tailElementNotSupported_test() {
        Document document = mock(Document.class);
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("Hello");
        node.outerHtmlTail(accum, depth, out);
    }

}