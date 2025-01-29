package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestTitle {

    public DocumentImpl(String baseUri) {
        super(baseUri);
    }

    @Override
    protected void afterDocument() throws Exception {
        if (getOuterHtml().contains("test-form")) {
            addStyleMap(Map.of(
                    "font-size", "24px",
                    "font-family", "Arial"
            ));
        }
    }
}

public class DocumentShellTest {

    public static void testHead(Document document) {
        Elements headElements = document.head();
        assertNotNull(headElements);
        assertEquals(1, headElements.size());
    }

    public static void testBody(Document document) {
        Elements bodyElements = document.body();
        assertNotNull(bodyElements);
        assertEquals(1, bodyElements.size());
    }

    public static Document expectForm(String cssQuery) {
        return new DocumentImpl("https://example.com").expectForm(cssQuery);
    }

    @Test
    public void testTitle() throws Exception {
        String baseUri = "https://example.com";
        Document document = new DocumentImpl(baseUri);
        Element element = document.createElement("title");
        element.text("Test Title").setStyleMap(Map.of(
                "font-size", "24px",
                "font-family", "Arial"
        ));
        element.attr("data-qs-key", "test-title");
        document.title(element).assertEquals("Test Title", document.title());
    }

}