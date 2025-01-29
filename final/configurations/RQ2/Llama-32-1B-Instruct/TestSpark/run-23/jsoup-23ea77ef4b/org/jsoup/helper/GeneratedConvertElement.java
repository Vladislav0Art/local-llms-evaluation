package org.jsoup.helper;

public class GeneratedConvertElement {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void convertElement() {
        org.jsoup.nodes.Element element = org.jsoup.nodes.Document.createElement("div");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        Document convertedDoc = w3cdom.convert(element);
        Assertions.assertEquals("<div>", convertedDoc.toString());
    }

}