package org.jsoup.nodes;

public class GeneratedTestElementOuterHtml {

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
    public void testElementOuterHtml() {
        String html = "<html><head></head><body>some data</body></html>";
        String out = new StringBuilder().append(html).toString();
        Element element = Jsoup.parse(html).body().children().first();
        element.outerHtml("", out);
        assertEquals(html, out);
    }

}