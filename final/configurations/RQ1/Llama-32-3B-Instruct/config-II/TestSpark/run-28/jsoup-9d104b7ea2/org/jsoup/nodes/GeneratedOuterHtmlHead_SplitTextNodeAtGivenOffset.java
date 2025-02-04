package org.jsoup.nodes;

public class GeneratedOuterHtmlHead_SplitTextNodeAtGivenOffset {

    @Test
    public void outerHtmlHead_SplitTextNodeAtGivenOffset() {
        // given
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = new TextNode("World");
        Element element = new Element(document, "div");

        document.appendChild(element);
        element.appendChild(splitTextNode);

        // when
        textNode.outerHtmlHead(accum, depth, out);

        // then
        assertEquals("<br>", accum.toString());
    }

}