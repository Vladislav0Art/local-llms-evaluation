package org.jsoup.helper;

public class GeneratedFromJsoupElementMethod {

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
    public void fromJsoupElementMethod() throws Exception {
        Document in = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("body");
        Assert.assertEquals(element, W3CDomHelper.sourceNodes("", org.jsoup.nodes.Node.class));
    }

}