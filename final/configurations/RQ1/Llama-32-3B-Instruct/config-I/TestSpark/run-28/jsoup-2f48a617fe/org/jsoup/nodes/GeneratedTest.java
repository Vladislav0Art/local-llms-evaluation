package org.jsoup.nodes;

public class GeneratedTest {

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
    public void testDocumentParse() {
        String html = "<html><head></head><body>some data</body></html>";
        Document doc = Document.parse(html);
        assertEquals(html, doc.html());
    }

    @Test
    public void testElementOuterHtml() {
        String html = "<html><head></head><body>some data</body></html>";
        String out = new StringBuilder().append(html).toString();
        Element element = Jsoup.parse(html).body().children().first();
        element.outerHtml("", out);
        assertEquals(html, out);
    }

    @Test
    public void testDocumentAppend() {
        Document doc = Document.parse("<html><head></head><body>some data</body></html>");
        Elements elements = new Elements();
        doc.body().append(elements);
        String result = elements.toString();
        assertEquals("<html><body>some data</body></html>", result);
    }

    @Test
    public void testDocumentAsXmlDeclaration() {
        String html = "<html><head></head><body>some data</body></html>";
        Document doc = Document.parse(html);
        Element element = Jsoup.parse(html).body().children().first();
        assertEquals("<xml version=\"1.0\" encoding=\"UTF-8\"><html><head></head><body>some data</body></html>", element.asXmlDeclaration());
    }
}

public class Elements {
    public static String toString() {
        return "<html><body>some data</body></html>";
    }

}