package org.jsoup.helper;

public class GeneratedTestOutputHtml {

    @Test
    public void testOutputHtml() {
        org.jsoup.nodes.Document doc = new Document();
        org.jsoup.helper.W3CDom.OutputHtml(doc, null);
        StringWriter writer = new StringWriter();
        org.jsoup.helper.W3CDom.outputHtml(writer, doc);
        assertEquals("<html><head></head><body>Hello World!</body></html>", writer.toString());
    }

}