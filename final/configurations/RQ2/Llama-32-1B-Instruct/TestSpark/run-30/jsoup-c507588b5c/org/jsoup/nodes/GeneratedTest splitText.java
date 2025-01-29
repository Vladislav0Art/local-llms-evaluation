package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest splitText {

    @Test
    public void test

    splitText() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        assertEquals(Arrays.asList("Hello", "World!"), TextNode.splitText(sb.toString()));
    }

}