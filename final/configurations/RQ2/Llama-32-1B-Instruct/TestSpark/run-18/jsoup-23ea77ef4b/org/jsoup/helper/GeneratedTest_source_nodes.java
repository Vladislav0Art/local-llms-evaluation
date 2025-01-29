package org.jsoup.helper;

public class GeneratedTest_source_nodes {

    @MethodUnderTest
    private static Document convert(org.jsoup.nodes.Document in) {
        return in;
    }

    @MethodUnderTest
    private static String asString(Document doc, @Nullable Map<String, String> properties) {
        return (properties == null || properties.isEmpty()) ? "" : String.join(", ", properties.keySet());
    }

    @Test
    public void test_source_nodes() {
        String xpath = "//body";
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        List<Node> nodeList = W3CDom.sourceNodes(selectXpath(xpath, doc), org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.size());
    }

    @MethodUnderTest
    private static Node contextNode(Document wDoc) {
        return wDoc.getDocumentElement();
    }

}