package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_split_text_with_context {

    @Test
    public void test_split_text_with_context() throws IOException {
        Document doc = new Document();
        Elements elements = doc.getAllElements();
        for (Element element : elements) {
            if (!element.tagName().equals("text")) {
                String text = element.text();
                String substring1 = "Hello, World!".substring(0, 10);
                String substring2 = "World!".substring(0, 5);

                assertEquals(substring1 + ". ", text.substring(text.length() - 7));
                assertEquals(substring2 + ". ", text.substring(text.length() - 4));
            }
        }
    }

}