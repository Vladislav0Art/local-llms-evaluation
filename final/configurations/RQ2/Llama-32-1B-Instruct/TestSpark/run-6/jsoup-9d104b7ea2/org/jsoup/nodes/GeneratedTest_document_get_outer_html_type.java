package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_document_get_outer_html_type {

    @Test
    public void test_document_get_outer_html_type() throws IOException {
        Document doc = new Document();
        Elements elements = doc.getAllElements();
        for (Element element : elements) {
            if (!element.tagName().equals("text")) {
                String text = element.text();

                assertEquals(5, text.length());
            }
        }

        // Add more test cases here
    }

}