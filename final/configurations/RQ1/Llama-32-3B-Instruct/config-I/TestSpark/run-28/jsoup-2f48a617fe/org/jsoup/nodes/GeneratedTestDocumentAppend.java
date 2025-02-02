package org.jsoup.nodes;

public class GeneratedTestDocumentAppend {

    private String html;

    public static Document parse(String html) {
        return new Document(html);
    }

    public void body() {
        // implementation of Jsoup's body method
    }

    public Elements append(Elements elements) {
        // implementation of Jsoup's append method
        return elements;
    }

    public String html() {
        return html;
    }

    public Element asXmlDeclaration() {
        // implementation of Jsoup's asXmlDeclaration method
        return null;
    }
}

public class Element extends org.jsoup.nodes.Element {
    // no need to add anything here, just extend the existing class
}
}

public class DocumentTest {

    @Test
    public void testDocumentAppend() {
        Document doc = Document.parse("<html><head></head><body>some data</body></html>");
        Elements elements = new Elements();
        doc.body().append(elements);
        String result = elements.toString();
        assertEquals("<html><body>some data</body></html>", result);
    }

}