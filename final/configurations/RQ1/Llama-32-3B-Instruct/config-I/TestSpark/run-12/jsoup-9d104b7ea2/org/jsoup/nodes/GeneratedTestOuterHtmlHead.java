package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        // Given
        String html = "<div><span>text</span></div>";
        TextNode textNode = new TextNode(html);

        // When
        String outerHtml = textNode.outerHtmlHead();

        // Then
        assertEquals("<" + html + ">", outerHtml);
    }

}