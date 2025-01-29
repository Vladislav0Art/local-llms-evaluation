package org.jsoup.helper;

public class GeneratedAsStringMethod {

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
    public void asStringMethod() throws Exception {
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("<body>Hello World!</body>", W3CDomHelper.sourceNodes(doc.toString(), null));
    }

}