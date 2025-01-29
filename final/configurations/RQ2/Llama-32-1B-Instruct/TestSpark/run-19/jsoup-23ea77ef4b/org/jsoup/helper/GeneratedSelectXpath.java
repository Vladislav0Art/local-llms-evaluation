package org.jsoup.helper;

public class GeneratedSelectXpath {

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Document expectedOut = new org.jsoup.nodes.Document();
        String xpath = "test";
        NodeList result = W3CDom.selectXpath(xpath, doc);
        Assert.assertTrue(result == expectedOut);
    }

}