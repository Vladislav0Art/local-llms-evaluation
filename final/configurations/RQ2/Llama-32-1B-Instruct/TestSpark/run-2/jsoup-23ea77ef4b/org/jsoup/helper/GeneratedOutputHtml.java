package org.jsoup.helper;

public class GeneratedOutputHtml {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void outputHtml() {
        Properties properties = new Properties();
        properties.setProperty("format", "html5");
        document = W3CDom.fromJsoup(document);
        String html = W3CDom.asString(document, properties);
        assertEquals("<!DOCTYPE html><html><body></body></html>", html);
    }

}