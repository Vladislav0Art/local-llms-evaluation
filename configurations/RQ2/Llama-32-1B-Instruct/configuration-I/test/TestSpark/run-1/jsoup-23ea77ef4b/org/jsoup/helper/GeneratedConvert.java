package org.jsoup.helper;

public class GeneratedConvert {

    private org.jsoup.nodes.Document document;

    @Test
    public void convert() {
        document = org.jsoup.select.Document.parse("<html><body>Hello World!</body></html>");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<html><body>Hello World!</body></html>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

}