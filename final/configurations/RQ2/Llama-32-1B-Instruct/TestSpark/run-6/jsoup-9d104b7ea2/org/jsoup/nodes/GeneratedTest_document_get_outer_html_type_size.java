package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_document_get_outer_html_type_size {

    @Test
    public void test_document_get_outer_html_type_size() throws IOException {
        Document doc = new Document();
        Elements elements = doc.getAllElements();
        for (Element element : elements) {
            if (!element.tagName().equals("text")) {
                String text = element.text();

                assertEquals(5, text.length());
            }
        }

        assertEquals("<html><body>Hello, World!</body></html>", doc.outerHtml().size() + 2);
    }

}