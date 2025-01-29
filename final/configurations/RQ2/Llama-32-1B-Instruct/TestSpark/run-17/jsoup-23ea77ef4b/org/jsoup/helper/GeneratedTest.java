package org.jsoup.helper;

public class GeneratedTest {

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

    @Test
    public void namespaceAwareNamespaceAwareMethod() throws Exception {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        W3CDom.W3CDom namespaceAware = new org.jsoup.helper.W3CDom();
        Assert.assertTrue(namespaceAware.sourceNodes("", org.jsoup.nodes.Node.class));
    }

    @Test
    public void convertMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("Hello World!", W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class));
    }

    @Test
    public void asStringMethod() throws Exception {
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("<body>Hello World!</body>", W3CDomHelper.sourceNodes(doc.toString(), null));
    }

    @Test
    public void OutputHtmlMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("<html><body>Hello World!</body></html>", W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class));
    }

    @Test
    public void OutputXmlMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        Assert.assertEquals("<html><body>Hello World!</body></html>", W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class));
    }

    @Test
    public void fromJsoupMethod() throws Exception {
        Document in = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Document out = new org.jsoup.nodes.Document();
        Assert.assertEquals(in, W3CDomHelper.sourceNodes("", org.jsoup.nodes.Node.class));
    }

    @Test
    public void fromJsoupElementMethod() throws Exception {
        Document in = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("body");
        Assert.assertEquals(element, W3CDomHelper.sourceNodes("", org.jsoup.nodes.Node.class));
    }

    @Test
    public void selectXpathMethod() throws Exception {
        String xpath = "body";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        NodeList nodeList = W3CDomHelper.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class);
        Assert.assertTrue(nodeList.getLength() > 0);
    }

    @Test
    public void selectXpathElementMethod() throws Exception {
        String xpath = "body";
        org.jsoup.nodes.Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        NodeList nodeList = W3CDomHelper.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.getLength());
        Assert.assertTrue(nodeList.item(0) instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void sourceNodesMethod() throws Exception {
        String inputString = "<html><body>Hello World!</body></html>";
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        List<String> nodeList = W3CDomHelper.sourceNodes(inputString, org.jsoup.nodes.Node.class);
        Assert.assertEquals(1, nodeList.size());
    }

    @Test
    public void contextNodeMethod() throws Exception {
        Document doc = new org.jsoup.nodes.Document(new org.jsoup.parser.Parser());
        org.jsoup.nodes.Element element = new org.jsoup.nodes.Element("body");
        W3CDom.W3CDom contextNode = new org.jsoup.helper.W3CDom();
        Assert.assertEquals(element, contextNode.sourceNodes(doc.toString(), org.jsoup.nodes.Node.class));
    }

}