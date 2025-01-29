package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestForms {

    private String baseUri;

    public DocumentImpl(String baseUri) {
        this.baseUri = baseUri;
    }

    @Override
    public void updateMetaCharsetElement(boolean update) {
        // implementation omitted for brevity
    }
}

public class DocumentShellTest {

    @Test
    public void testForms() {
        String baseUri = "https://example.com";
        Document document = new DocumentImpl(baseUri);
        FormElement form = document.expectForm("test-form");
        assertNotNull(form);
        assertEquals("test-form", form.cssQuery());
    }

}