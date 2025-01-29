package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest splitTextWithOneElement {

    @Test
    public void test

    splitTextWithOneElement() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(Arrays.asList("Hello", ""), TextNode.splitTextWithOneElement(sb.toString()));
    }

}