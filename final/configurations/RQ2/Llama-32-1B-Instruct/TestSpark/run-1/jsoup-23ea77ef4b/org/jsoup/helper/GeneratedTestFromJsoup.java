package org.jsoup.helper;

public class GeneratedTestFromJsoup {

    @Test
    public void testFromJsoup() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Document fromJsoupMethod = instance.fromJsoup(document);
        assert fromJsoupMethod instanceof org.jsoup.nodes.Document;
    }

}