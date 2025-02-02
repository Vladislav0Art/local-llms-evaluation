package org.jsoup.nodes;

public class GeneratedTestJsoupOuterHtml {

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
    public void testJsoupOuterHtml() throws Exception {
        Document document = Jsoup.parse("<div>Hello <span>World</span></div>");
        TextNode textNode = new TextNode(document, "Hello", 0);
        String outerHtml = textNode.outerHtml();
        org.junit.Assert.assertEquals("<p>Hello</p>", outerHtml);
    }

}