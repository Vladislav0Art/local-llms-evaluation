package org.jsoup.helper;

public class GeneratedAsString {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void asString() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        String result = new org.jsoup.helper.W3CDom().asString(doc);
        Assertions.assertEquals("Hello World!", result);
    }

}