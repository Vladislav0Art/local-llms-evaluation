package org.jsoup.helper;

public class GeneratedSelectXpathContextNode {

    @Test
    public void selectXpathContextNode() {
        org.jsoup.nodes.Element in = new org.jsoup.nodes.Element();
        org.jsoup.nodes.Document out = new org.jsoup.nodes.Document();
        String xpath = "test";
        NodeList result = W3CDom.selectXpath(xpath, in);
        Assert.assertTrue(result == new org.jsoup.nodes.Document());
    }

}