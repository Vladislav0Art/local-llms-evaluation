package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Test that outerHtmlHead adds the correct indent when the text is not blank and the next node will cause an indent
        TextNode doc = new TextNode("<p>Hello World!</p>");
        Document document = new Document();
        Appendable accum = document.getAppendable().createBuffer(0, 10);
        indent(accum, 0, document, true);
        assertTrue(StripLeadingWhitespace(accum.toString()).contains("Hello "));
    }

}