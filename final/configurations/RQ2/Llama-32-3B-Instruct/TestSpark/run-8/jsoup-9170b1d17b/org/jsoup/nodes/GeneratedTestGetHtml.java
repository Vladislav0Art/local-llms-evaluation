package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestGetHtml {

    @Test
    public void testGetHtml() {
        Document document = new Element("html").appendText("test");
        Attributes attributes = document.attributes();
        assertEquals("<html>test</html>", attributes.html());
    }
}

class MockAttribute implements Attribute {
    private String key;

    public MockAttribute(String key) {
        this.key = key;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public String getValue() {
        return "test";
    }

}