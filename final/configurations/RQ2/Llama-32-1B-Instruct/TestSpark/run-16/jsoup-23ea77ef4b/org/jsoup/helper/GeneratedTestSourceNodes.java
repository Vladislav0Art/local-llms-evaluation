package org.jsoup.helper;

public class GeneratedTestSourceNodes {

    private Document document;

    public boolean namespaceAware() {
        return false;
    }

    public W3CDom namespaceAware(boolean namespaceAware) {
        return new W3CDom(namespaceAware);
    }

    public static Document convert(org.jsoup.nodes.Document in) {
        String documentString = in.outerHtml();
        document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new java.io.StringWriter(), documentString.trim());
        return document;
    }

    @Test
    public void testSourceNodes() {
        org.jsoup.nodes.Document doc = new W3CDom().fromJsoup(org.jsoup.nodes.Element.createTag("body", "class=\"container\" id=\"main-content\"")))
        ;
        String xpath = "//div[@class=\"container\"]";
        NodeList nodeList = sourceNodes(nodeList, Object.class);
        assertNotNull(nodeList);
    }

}