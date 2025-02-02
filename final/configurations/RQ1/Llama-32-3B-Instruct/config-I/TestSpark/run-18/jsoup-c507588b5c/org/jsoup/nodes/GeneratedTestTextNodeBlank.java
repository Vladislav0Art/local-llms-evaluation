package org.jsoup.nodes;

public class GeneratedTestTextNodeBlank {

    @org.junit.Test
    public void testJsoupSplitText() throws Exception {
        Document document = Jsoup.parse("<div>Hello <span>World</span></div>");
        TextNode textNode = new TextNode(document, "Hello", 0);
        org.junit.Assert.assertEquals("Hello World", textNode.value());
        String clonedTextNodeValue = textNode.splitText(10).value();
        org.junit.Assert.assertEquals("Hello", clonedTextNodeValue);

        assertTrue(textNode.isBlank());
    }

    @Test
    public void testTextNodeBlank() throws Exception {
        Document document = Jsoup.parse("<div>Hello <span>World</span></div>");
        TextNode textNode = new TextNode(document, "Hello", 0);
        assertTrue(textNode.isBlank());

        // Added a blank line for better readability of assert statements
        System.out.println();

        textNode = new TextNode(Jsoup.parse("<div></div>"), "", 0);
        assertTrue(textNode.isBlank());
    }
}

public class TextNode {
    private Document document;
    private String value;
    private int offset;

    public TextNode(Document document, String value, int offset) {
        this.document = document;
        this.value = value;
        this.offset = offset;
    }

    public String value() {
        return value;
    }

    public String outerHtml() {
        // This method is a simple implementation and may not cover all cases
        return "<p>" + value + "</p>";
    }

    public String splitText(int length) {
        if (length < 0 || offset + length > document.text().length()) {
            throw new IllegalArgumentException("Invalid offset or length");
        }
        return document.text().substring(offset, offset + length);
    }

    public boolean isBlank() {
        return value.trim().isEmpty();
    }

}