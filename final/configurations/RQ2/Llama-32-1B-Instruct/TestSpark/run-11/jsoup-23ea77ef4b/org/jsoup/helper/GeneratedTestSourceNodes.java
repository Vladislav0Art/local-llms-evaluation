package org.jsoup.helper;

public class GeneratedTestSourceNodes {

    @Test
    public void testSourceNodes() {
        org.jsoup.nodes.Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(document);
        List<String> sourceNodes = W3CDom.sourceNodes(document.getNodeList(), String.class);
        assertEquals(1, sourceNodes.size());
    }

}