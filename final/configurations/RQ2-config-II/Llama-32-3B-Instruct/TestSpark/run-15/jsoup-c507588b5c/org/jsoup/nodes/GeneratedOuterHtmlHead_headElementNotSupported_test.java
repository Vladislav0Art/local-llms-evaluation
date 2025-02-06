package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_headElementNotSupported_test {

    @Test
    public void outerHtmlHead_headElementNotSupported_test() {
        Document document = mock(Document.class);
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("Hello");
        node.outerHtmlHead(accum, depth, out);
    }

}