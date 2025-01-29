package org.jsoup.helper;

public class GeneratedTest {

    private org.jsoup.nodes.Document document;
    private Element element;

    public boolean namespaceAware() {
        return false;
    }

    public W3CDom namespaceAware(boolean namespaceAware) {
        return new W3CDom(namespaceAware);
    }

    public Document convert(String html) {
        try {
            document = (org.jsoup.nodes.Document) classLoader.loadClass("jsoup.Document").newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        element = (Element) classLoader.loadClass("jsoup.helper.Element").newInstance();
        document.setDocumentHandler(new DocumentHandler());
        try {
            document.parse(html);
        } catch (org.jsoup.JsoupException e) {
            throw new RuntimeException(e);
        }
        return document;
    }

}