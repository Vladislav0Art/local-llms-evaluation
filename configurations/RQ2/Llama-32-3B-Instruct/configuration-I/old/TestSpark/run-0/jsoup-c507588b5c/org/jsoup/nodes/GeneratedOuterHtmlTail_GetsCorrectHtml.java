package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GetsCorrectHtml {

    @Test
    public void outerHtmlTail_GetsCorrectHtml() {
        // given
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Hello World");

        // when
        textNode.outerHtmlTail(accum, 0, out);

        // then
        assertNotEquals("", accum.toString());
    }

}