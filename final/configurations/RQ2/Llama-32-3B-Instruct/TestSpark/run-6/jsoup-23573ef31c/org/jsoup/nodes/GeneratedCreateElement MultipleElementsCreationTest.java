package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateElement MultipleElementsCreationTest {

    @Test
    public void createElement

    MultipleElementsCreationTest() {
        Document document = new Document("http://example.com");
        Elements elements = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Element element = document.createElement("div");
            elements.add(element);
        }
        assertEquals(10, elements.size());
    }

}