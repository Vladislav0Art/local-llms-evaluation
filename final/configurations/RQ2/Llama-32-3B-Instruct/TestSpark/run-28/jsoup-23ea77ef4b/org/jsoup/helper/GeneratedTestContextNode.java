package org.jsoup.helper;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        Document document = org.jsoup.Jsoup.parse("<html><body><h1>Hello, World!</h1></body></html>");
        Node contextNode = new Node();
        Document test = W3CDom.contextNode(document);
        assertNotNull(test);
    }

}