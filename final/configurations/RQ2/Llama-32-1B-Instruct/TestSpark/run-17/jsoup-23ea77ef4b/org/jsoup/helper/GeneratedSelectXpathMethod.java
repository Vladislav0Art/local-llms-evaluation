package org.jsoup.helper;

public class GeneratedSelectXpathMethod {

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
    public void selectXpathMethod() throws Exception {
        String xpath = "body";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        NodeList nodeList = W3CDomHelper.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class);
        Assert.assertTrue(nodeList.getLength() > 0);
    }

}