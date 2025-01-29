package org.jsoup.helper;

public class GeneratedSourceNodesMethod {

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
    public void sourceNodesMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        List<String> nodeList = W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.size());
    }

}