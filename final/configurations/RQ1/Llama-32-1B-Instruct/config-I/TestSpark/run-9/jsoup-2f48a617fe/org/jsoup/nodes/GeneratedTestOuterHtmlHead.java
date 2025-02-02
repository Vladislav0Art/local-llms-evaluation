package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = parse("<!-- This is a new XML declaration -->");
        Appendable accum = new StringWriter();
        comment.outerHtmlHead(accum, 0, document.getOutputSettings().prettyPrint());
        assertEquals("<!--\nThis is a new XML declaration -->", new String(accum.toString()));
    }

}