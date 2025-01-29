package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Document document = new Document();
        Appendable accum = document.newOutputStream();
        outerHtmlTail(accum, 1, document);
        assertEquals("<p>Hello World</p>", String.valueOf(accum));
    }

}