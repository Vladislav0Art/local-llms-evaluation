package org.jsoup.helper;

public class GeneratedConvertDoc {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void convertDoc() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        Document convertedDoc = w3cdom.convert(doc);
        Assertions.assertEquals("<html><body>Hello World!</body></html>", convertedDoc.toString());
    }

}