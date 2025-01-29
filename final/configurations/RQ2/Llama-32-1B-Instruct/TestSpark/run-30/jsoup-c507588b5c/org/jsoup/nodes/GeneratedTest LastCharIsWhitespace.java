package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest LastCharIsWhitespace {

    @Test
    public void test

    LastCharIsWhitespace() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(false, TextNode.lastCharIsWhitespace(sb.toString()));
    }

}