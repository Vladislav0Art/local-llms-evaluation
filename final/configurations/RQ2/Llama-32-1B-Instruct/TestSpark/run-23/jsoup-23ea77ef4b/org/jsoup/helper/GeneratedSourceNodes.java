package org.jsoup.helper;

public class GeneratedSourceNodes {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        List<org.jsoup.nodes.Node> list = new org.jsoup.helper.W3CDom().sourceNodes(doc, org.jsoup.nodes.NodeType.Text);
        Assertions.assertEquals(new ArrayList<>(Arrays.asList(doc.createTextNode("Hello World!"))), list);
    }

}