package org.jsoup.helper;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Node node = W3CDom.contextNode(doc, null);
        // assert that the context node was created correctly
        assertEquals(null, node);
    }

}