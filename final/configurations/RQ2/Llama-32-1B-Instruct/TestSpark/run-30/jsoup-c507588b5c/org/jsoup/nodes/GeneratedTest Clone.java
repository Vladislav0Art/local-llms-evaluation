package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest Clone {

    @Test
    public void test

    Clone() {
        String text = "Hello World!";
        Document document = new Document();
        Elements elements = document.getElementsByTag("p");
        StringBuilder sb = new StringBuilder();
        for (Element element : elements) {
            sb.append(element.text()).append("\n");
        }
        TextNode textNode = new TextNode(sb.toString());
        TextNode clonedTextNode = textNode.clone();
        assertEquals(text, textNode.getText());
        assertEquals(text, clonedTextNode.getText());
    }

}