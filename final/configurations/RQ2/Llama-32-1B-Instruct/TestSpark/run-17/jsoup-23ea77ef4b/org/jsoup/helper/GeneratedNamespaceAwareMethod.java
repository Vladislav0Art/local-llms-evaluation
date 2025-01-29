package org.jsoup.helper;

public class GeneratedNamespaceAwareMethod {

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
    public void namespaceAwareMethod() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Assert.assertTrue(W3CDomHelper.sourceNodes("", org.jsoup.nodes.Node.class));
    }

}