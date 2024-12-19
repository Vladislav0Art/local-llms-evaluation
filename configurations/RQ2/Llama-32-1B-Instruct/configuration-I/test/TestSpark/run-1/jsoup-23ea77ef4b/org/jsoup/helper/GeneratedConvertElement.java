package org.jsoup.helper;

public class GeneratedConvertElement {

    private org.jsoup.nodes.Document document;

    @Test
    public void convertElement() {
        document = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        W3CDom.convert(document, null);
        Document expectedDocument = org.jsoup.select.Document.parse("<html><body>Hello <span>World!</span></body></html>");
        assertEquals(expectedDocument, W3CDom.fromJsoup(document));
    }

}