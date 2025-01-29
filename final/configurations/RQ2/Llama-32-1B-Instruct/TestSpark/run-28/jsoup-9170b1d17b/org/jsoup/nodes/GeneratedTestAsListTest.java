package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class GeneratedTestAsListTest {

    private Document doc = new Document();

    @Test
    public void testAsListTest() {
        Elements elements = doc.select("key");
        List<Attribute> list = new ArrayList<>();
        for (Element element : elements) {
            list.add(element.getUserNode());
        }
        System.out.println(list);
    }

}