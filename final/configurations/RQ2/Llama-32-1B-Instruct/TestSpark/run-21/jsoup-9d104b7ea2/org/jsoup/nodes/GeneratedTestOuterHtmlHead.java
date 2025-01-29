package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Document document = new Document();
        Appendable accum = document.newOutputStream();
        outerHtmlHead(accum, 1, document);
        assertEquals("<p>Hello World</p>", String.valueOf(accum));
    }

}