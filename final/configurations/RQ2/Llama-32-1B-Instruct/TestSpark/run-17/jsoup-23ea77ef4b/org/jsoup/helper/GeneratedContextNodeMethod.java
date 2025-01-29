package org.jsoup.helper;

public class GeneratedContextNodeMethod {

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
    public void contextNodeMethod() throws Exception {
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("body");
        W3CDom.W3CDom contextNode = new org.jsoup.helper.W3CDom();
        Assert.assertEquals(element, contextNode.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class));
    }

}