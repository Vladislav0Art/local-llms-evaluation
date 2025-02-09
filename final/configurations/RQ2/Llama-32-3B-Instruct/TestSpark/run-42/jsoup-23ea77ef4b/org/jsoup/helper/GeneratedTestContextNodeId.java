package org.jsoup.helper;

public class GeneratedTestContextNodeId {

    @Test
    public void testContextNodeId() {
        Document wDoc = new org.jsoup.nodes.Document();
        String id = "someId";
        Document node = wDoc.getElementById(id);
        assertNotNull(node);
        Node contextNode = W3CDom.contextNode(wDoc);
        assertEquals(id, contextNode.getId());
    }

}