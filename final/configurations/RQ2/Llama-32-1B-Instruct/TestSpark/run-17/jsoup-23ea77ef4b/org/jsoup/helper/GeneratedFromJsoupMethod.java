package org.jsoup.helper;

public class GeneratedFromJsoupMethod {

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
    public void fromJsoupMethod() throws Exception {
        Document in = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Document out = new org.jsoup.nodes.Document();
        Assert.assertEquals(in, W3CDomHelper.sourceNodes("", org.jsoup.nodes.Node.class));
    }

}