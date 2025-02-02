package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        // Given
        String html = "<div><span>text</span></div>";
        TextNode textNode = new TextNode(html);

        // When
        String outerHtml = textNode.outerHtmlTail();

        // Then
        assertEquals("</" + html + ">", outerHtml);
    }

}