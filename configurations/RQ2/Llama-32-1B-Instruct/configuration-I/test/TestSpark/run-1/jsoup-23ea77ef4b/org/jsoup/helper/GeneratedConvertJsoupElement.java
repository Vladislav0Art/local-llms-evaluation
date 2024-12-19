package org.jsoup.helper;

public class GeneratedConvertJsoupElement {

    private org.jsoup.nodes.Document document;

    @Test
    public void convertJsoupElement() {
        document = org.jsoup.select.Document.parse("Hello World!");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<p>Hello World!</p>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

}