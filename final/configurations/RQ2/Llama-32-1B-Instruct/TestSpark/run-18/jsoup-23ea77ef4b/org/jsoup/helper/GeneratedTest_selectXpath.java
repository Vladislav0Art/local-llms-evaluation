package org.jsoup.helper;

public class GeneratedTest_selectXpath {

    @MethodUnderTest
    private static Document convert(org.jsoup.nodes.Document in) {
        return in;
    }

    @MethodUnderTest
    private static String asString(Document doc, @Nullable Map<String, String> properties) {
        return (properties == null || properties.isEmpty()) ? "" : String.join(", ", properties.keySet());
    }

    @Test
    public void test_selectXpath() {
        String xpath = "//*";
        Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        NodeList nodeList = W3CDom.selectXpath(xpath, doc);
        Assert.assertEquals(0, nodeList.getLength());
    }

    @MethodUnderTest
    private static NodeList selectXpath(String xpath, Node contextNode) {
        return (contextNode == null || contextNode.getNodeName().startsWith(xpath)) ? Collections.emptyList() : W3CDom.sourceNodes(selectXpath(xpath, contextNode), org.jsoup.nodes.Node.class);
    }

}