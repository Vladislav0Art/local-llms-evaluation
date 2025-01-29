package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestHead {

    private String baseUri;

    @Override
    protected void afterDocument() throws Exception {
        super.afterDocument();
        if (getOuterHtml().contains("test-form")) {
            addStyleMap(Map.of(
                    "font-size", "24px",
                    "font-family", "Arial"
            ));
        }
    }

    public static DocumentImpl createShell(String baseUri) {
        return new DocumentImpl(baseUri);
    }

    @Test
    public void testHead() throws Exception {
        String document = DocumentImpl.createShell("https://example.com").head();
        Elements headElements = document.head();
        assertNotNull(headElements);
        assertEquals(1, headElements.size());
    }

    public static Document expectForm(String cssQuery) throws Exception {
        return DocumentImpl.createShell("https://example.com").expectForm(cssQuery);
    }

}