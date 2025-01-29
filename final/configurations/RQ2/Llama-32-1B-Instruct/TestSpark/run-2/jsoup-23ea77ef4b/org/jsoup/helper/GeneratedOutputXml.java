package org.jsoup.helper;

public class GeneratedOutputXml {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void outputXml() {
        Properties properties = new Properties();
        Document doc = W3CDom.OutputHtml().getDocument();
        document = doc;
        String xml = W3CDom.asString(doc, properties);
        assertEquals("<!DOCTYPE html><html><body></body></html>", xml);
    }

}