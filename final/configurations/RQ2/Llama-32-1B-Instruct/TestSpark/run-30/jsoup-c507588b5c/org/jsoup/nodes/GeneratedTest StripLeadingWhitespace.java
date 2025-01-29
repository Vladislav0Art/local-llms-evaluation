package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest StripLeadingWhitespace {

    @Test
    public void test

    StripLeadingWhitespace() {
        String text = "   Hello World!   ";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(text, TextNode.stripLeadingWhitespace(sb.toString()));
    }

}