package org.jsoup.helper;

public class GeneratedOutputXmlMethod {

    public static String sourceNodes(String inputString, Class<?> nodeType) {
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        return W3CDom.asString(doc);
    }

    public static Node contextNode(Document in) {
        return new org.jsoup.nodes.Document(in).contextNode();
    }
}

public class W3CDomTest {

    @Test
    public void OutputXmlMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("<html><body>Hello World!</body></html>", W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class));
    }

}