package org.jsoup.helper;

public class GeneratedSelectXpathElementMethod {

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
    public void selectXpathElementMethod() throws Exception {
        String xpath = "body";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        NodeList nodeList = W3CDomHelper.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.getLength());
        Assert.assertTrue(nodeList.item(0) instanceof org.jsoup.nodes.Element);
    }

}