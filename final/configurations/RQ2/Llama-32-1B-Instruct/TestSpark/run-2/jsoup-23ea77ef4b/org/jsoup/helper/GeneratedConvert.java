package org.jsoup.helper;

public class GeneratedConvert {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void convert() {
        org.jsoup.nodes.Document in = new DocumentBuilder().build("test.xml").newDocument();
        document = W3CDom.fromJsoup(in);
        output = W3CDom.fromJsoup(document);
        assertEquals(document, output);
    }

}