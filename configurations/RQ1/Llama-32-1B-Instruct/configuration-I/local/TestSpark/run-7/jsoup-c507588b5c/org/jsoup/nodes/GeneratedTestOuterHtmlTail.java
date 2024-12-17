package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        // Test that outerHtmlTail does not add any content to the appendable when there are no sibling nodes
        TextNode doc = new TextNode("");
        Document document = new Document();
        Appendable accum = document.getAppendable().createBuffer(0, 10);
        indent(accum, 0, document, false);
        assertEquals("", StripLeadingWhitespace(accum.toString()));
    }

}