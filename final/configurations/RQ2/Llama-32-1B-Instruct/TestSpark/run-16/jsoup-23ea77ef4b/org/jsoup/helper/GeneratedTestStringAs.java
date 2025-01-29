package org.jsoup.helper;

public class GeneratedTestStringAs {

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
    public void testStringAs() {
        org.jsoup.nodes.Document doc = new W3CDom().fromJsoup(org.jsoup.nodes.Element.createTag("body", "class=\"container\" id=\"main-content\"")))
        ;
        String properties = "<x-prop1='value1'>value1</x-prop1>";
        document = convert(doc);
        assertEquals(properties, asString(document, Map.of()));
    }

}