package org.jsoup.helper;

public class GeneratedNamespaceAwareNamespaceAwareMethod {

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
    public void namespaceAwareNamespaceAwareMethod() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        W3CDom.W3CDom namespaceAware = new org.jsoup.helper.W3CDom();
        Assert.assertTrue(namespaceAware.sourceNodes("", org.jsoup.nodes.Node.class));
    }

}