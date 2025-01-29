package org.jsoup.helper;

public class GeneratedContextNode {

    @Test
    public void contextNode() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        Document expectedOut = new org.jsoup.nodes.Document();
        String xpath = "test";
        Node result = W3CDom.contextNode(doc, expectedOut);
        Assert.assertNotNull(result);
    }

}