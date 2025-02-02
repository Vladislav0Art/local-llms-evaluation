package org.jsoup.nodes;

public class GeneratedTest {

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

    @Test
    public void testOuterHtml() throws IOException {
        // Given
        String html = "<div><span>text</span></div>";
        TextNode textNode = new TextNode(html);

        // When
        String outerHtml = textNode.outerHtml();

        // Then
        assertEquals("<" + html + ">", outerHtml);
    }
}

public class TextNode {
    private String html;

    public TextNode(String html) {
        this.html = html;
    }

    public String outerHtmlHead() {
        return "<" + html + ">";
    }

    public String outerHtmlTail() {
        return "</" + html + ">";
    }

    public String outerHtml() {
        return "<" + html + ">";
    }

    public TextNode clone() {
        return new TextNode(html);
    }

}