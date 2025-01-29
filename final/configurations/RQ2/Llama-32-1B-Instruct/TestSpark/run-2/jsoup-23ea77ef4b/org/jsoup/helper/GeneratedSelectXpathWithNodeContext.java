package org.jsoup.helper;

public class GeneratedSelectXpathWithNodeContext {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void selectXpathWithNodeContext() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.select("p");
        assertEquals(1, list.getLength());
        String xpath = "p";
        Node contextNode = W3CDom.contextNode(doc);
        output = W3CDom.SelectXpath(xpath, contextNode);
        System.out.println(output.toString());
    }

}