package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestOuterHtmlHead_NestedNodes {

    public static Node createTextNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void testOuterHtmlHead_NestedNodes() {
        Elements nodes = new Elements();
        Document doc = new Document();
        for (int i = 0; i < 10; i++) {
            Element element = new Element("div");
            node = createTextNode(String.valueOf(i));
            element.appendChild(node);
            nodes.add(element);
        }
        doc.appendChild(nodes);
        TextNode text = createTextNode(doc.body().text());
        System.out.println(text.text());
    }

}