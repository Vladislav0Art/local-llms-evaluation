package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        String htmlContent = "<p>Hello <b>world</b></p>";
        textNode.addText(htmlContent, accum, document, 0, null);
        assertEquals("<p>Hello <b>world</b></p>", accum.toString());
    }

}