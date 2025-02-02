package org.jsoup.nodes;

public class GeneratedTestClone {

    @Test
    public void testClone() throws IOException {
        // Given
        String html = "<div><span>text</span></div>";
        TextNode textNode = new TextNode(html);

        // When
        TextNode clonedTextNode = textNode.clone();

        // Then
        assertEquals("<" + html + ">", clonedTextNode.outerHtmlHead());
    }

}