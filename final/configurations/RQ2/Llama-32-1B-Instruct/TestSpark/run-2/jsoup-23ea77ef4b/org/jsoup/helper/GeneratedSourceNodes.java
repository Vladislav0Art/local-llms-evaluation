package org.jsoup.helper;

public class GeneratedSourceNodes {

    private static org.jsoup.nodes.Document document;
    private static org.jsoup.nodes.Document output;

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document doc = new DocumentBuilder().build("<html><body><p>Hello World!</p></body></html>");
        NodeList list = document.sourceNodes(new org.jsoup.nodes.NodeList(), org.jsoup.nodes.Node.class);
        assertEquals(1, list.getLength());
        String xpath = "p";
        output = W3CDom.SelectXpath(xpath, doc);
        System.out.println(output.toString());
    }

}