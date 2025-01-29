package org.jsoup.helper;

public class GeneratedTest {

    private static final Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");

    @Test
    public void namespaceAware() {
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.namespaceAware();
    }

    @Test
    public void namespaceAwareNonNamespaceAware() {
        W3CDom w3cdom = new W3CDom();
        Assert.assertFalse(w3cdom.namespaceAware());
        Assert.assertFalse(w3cdom.namespaceAware(true));
    }

    @Test
    public void namespaceAwareWithCustomNamespace() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(true, "http://example.com");
        Assert.assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithMultipleNamespaces() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware("http://example.com", "http://example.net");
        Assert.assertTrue(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithNonStandardNamespace() {
        W3CDom w3cdom = new W3CDom();
        w3cdom.namespaceAware(false, "http://example.com/namespace");
        Assert.assertFalse(w3cdom.namespaceAware());
    }

    @Test
    public void namespaceAwareWithEmptyStringAsNamespace() {
        W3CDom w3cdom = new W3CDom();
        Assert.assertFalse(w3cdom.namespaceAware(""));
    }

    @Test
    public void namespaceAwareWithEmptyMapAsNamespace() {
        W3CDom w3cdom = new W3CDom();
        Map<String, String> map = new HashMap<>();
        map.put("namespace", "");
        Assert.assertTrue(w3cdom.namespaceAware(map));
    }

    @Test
    public void namespaceAwareWithNullStringAsNamespace() {
        W3CDom w3cdom = new W3CDom();
        Assert.assertFalse(w3cdom.namespaceAware(null, ""));
    }

    @Test
    public void convert() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(document);
    }

    @Test
    public void convertNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(document);
    }

    @Test
    public void convertNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        W3CDom w3cdom = new W3CDom();
        assert w3cdom.convert(element);
    }

    @Test
    public void selectXpath() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div"));
    }

    @Test
    public void selectXpathNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div"));
    }

    @Test
    public void selectXpathNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.selectXpath("//div"));
    }

    @Test
    public void selectXpathWithParentNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div", null));
    }

    @Test
    public void selectXpathWithParentElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div", element -> null));
    }

    @Test
    public void selectXpathWithSelector() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div", "test"));
    }

    @Test
    public void selectXpathWithSelectorNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.selectXpath("//div", element -> null));
    }

    @Test
    public void selectXpathWithSelectorNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.selectXpath("//div", element -> null));
    }

    @Test
    public void sourceNodes() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithParentNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithParentElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelector() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndParentNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndParentElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndParentElementNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndParentElementNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndSelector() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndSelectorNonJsoupNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        W3CDom w3cdom = new W3CDom();
        assertEquals(5, w3cdom.sourceNodes());
    }

    @Test
    public void sourceNodesWithSelectorAndSelectorNonJsoupElement() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse("src/test/resources/w3cdom.xml");
        org.jsoup.nodes.Element element = document.getElementById("test");
        assertEquals(5, w3cdom.sourceNodes());
    }

}