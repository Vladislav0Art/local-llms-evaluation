package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_SplitTextNodeAtGivenOffset {

    @Test
    public void outerHtmlTail_SplitTextNodeAtGivenOffset() {
        // given
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();

        TextNode textNode = new TextNode("Hello World");
        TextNode splitTextNode = new TextNode("World");

        // when
        textNode.outerHtmlTail(accum, depth, out);

        // then
        assertEquals("", accum.toString());
    }

}