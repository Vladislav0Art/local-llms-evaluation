package org.jsoup.helper;

public class GeneratedContextNodeWithJsoup {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void contextNodeWithJsoup() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(doc);
        String xml = W3CDom.asString(jsoupDoc, null);
        assertEquals("<html><body><p>Hello World!</p></body></html>", xml);
    }

}