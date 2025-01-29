package org.jsoup.helper;

public class GeneratedTestFromJsoup {

    private org.jsoup.nodes.Document document;
    private Element element;

    public boolean namespaceAware() {
        return false;
    }

    public W3CDom namespaceAware(boolean namespaceAware) {
        return new W3CDom(namespaceAware);
    }

    public Document convert(org.jsoup.nodes.Document in) {
        String documentString = in.outerHtml();
        try {
            document = (org.jsoup.nodes.Document) classLoader.loadClass("jsoup.Document").newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        elementDocument = (Element) classLoader.loadClass("jsoup.helper.Element").newInstance();
        document.setDocumentHandler(new DocumentHandler());
        document.parse(documentString);
        return document;
    }

    @Test
    public void testFromJsoup() {
        W3CDom w3cdom = new W3CDom();
        Element body = new org.jsoup.nodes.Element("body");
        body.attr("class", "container").attr("id", "main-content");
        Element mainContent = new org.jsoup.nodes.Element("div");
        mainContent.attr("class", "container").attr("id", "main-content");
        w3cdom.document.appendChild(body);
        w3cdom.document.appendChild(mainContent);
        org.jsoup.nodes.Document doc = w3cdom.convert(w3cdom.elementDocument);
        System.out.println(doc.html());
    }

    public static void main(String[] args) {
        TestSparkRunner.runTestClass();
    }

}