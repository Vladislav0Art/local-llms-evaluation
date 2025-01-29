package org.jsoup.helper;

public class GeneratedSourceNodesWithParentElement {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void sourceNodesWithParentElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

}