package org.jsoup.helper;

public class GeneratedTestContextNode {

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
    public void testContextNode() {
        org.jsoup.nodes.Document doc = new W3CDom().convert(org.jsoup.nodes.Document.createTag("html")));
        assertNotNull(doc);
        assertEquals("<html>", contextNode(doc).getTextContent());
    }

}