package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;

public class GeneratedTestData {

    private Node node;
    private Document document;
    private String tagName;
    private String tagValue;

    public void setup() {
        document = new Document();
        node = mock(Node.class);
        tagName = "div";
        tagValue = "Hello World!";
    }

    @Test
    public void testData() {
        String data = "Hello World!";
        Element element = new Element(tagName, data, null);
        assertEquals(data, element.data());
    }

}