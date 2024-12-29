package org.jsoup.helper;

public class GeneratedTestFromJsoupConstructor {

    @Test
    public void testFromJsoupConstructor() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Document fromJsoupConstructorMethod = instance.fromJsoup(document);
        assert fromJsoupConstructorMethod instanceof org.jsoup.nodes.Document;
    }

}