package org.jsoup.helper;

public class GeneratedTestOutputXml {

    @Test
    public void testOutputXml() {
        org.jsoup.nodes.Document doc = new Document();
        org.jsoup.helper.W3CDom.OutputXml(doc, null);
        StringWriter writer = new StringWriter();
        org.jsoup.helper.W3CDom.outputXml(writer, doc);
        assertEquals("<html><head></head><body>Hello World!</body></html>", writer.toString());
    }

}