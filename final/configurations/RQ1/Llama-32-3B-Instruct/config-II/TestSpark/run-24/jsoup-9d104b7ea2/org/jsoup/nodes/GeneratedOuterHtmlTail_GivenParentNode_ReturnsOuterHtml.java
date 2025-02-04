package org.jsoup.nodes;

public class GeneratedOuterHtmlTail_GivenParentNode_ReturnsOuterHtml {

    @Test
    public void outerHtmlTail_GivenParentNode_ReturnsOuterHtml() throws IOException {
        // given
        Document document = new Document();
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("Hello World");
        Element parent = mock(Element.class);

        when(parentNode).thenReturn(document);
        doReturn(document).when(parent).nodeType();

        // when
        String outerHtml = textNode.outerHtmlTail(accum, 0, out);

        // then
        assertNotNull(outerHtml);
    }

}