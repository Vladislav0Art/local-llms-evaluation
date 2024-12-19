package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;

public class GeneratedTestPreserveWhitespace {

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
    public void testPreserveWhitespace() {
        Element element = new Element(tagName + ":tag", tagValue);
        preserveWhitespace(element).addNode(new Text("Hello World!"));
        assertEquals("Hello World!", element.text());
    }

}