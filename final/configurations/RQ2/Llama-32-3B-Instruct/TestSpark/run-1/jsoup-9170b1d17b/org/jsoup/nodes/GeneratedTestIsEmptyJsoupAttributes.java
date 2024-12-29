package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIsEmptyJsoupAttributes {

    @Test
    public void testIsEmptyJsoupAttributes() {
        Document document = Jsoup.connect("http://example.com").get();
        Element element = new Element("+a", "", "key", "");
        Attributes attributes = new Attributes(element, "data-user-data", "value");
        attributes.clear();
        assertTrue(attributes.isEmpty());
    }
}

class Document {
    public Elements select(String selector) {
        return null;
    }

    public void append(Element element) {
    }
}

class Element extends org.jsoup.nodes.Element {
    public String attr(String name) {
        return "";
    }

    @Override
    public Iterator<Attribute> iterator() {
        return new Iterator > ();
    }

    public boolean has(int index) {
        return false;
    }
}

class Attributes {
    private String key;

    public Attributes(Element element, String key, String value) {
        this.key = key;
    }

    public void clear() {
    }

    public boolean isEmpty() {
        return true;
    }

    @Override
    public Iterator<Attribute> iterator() {
        return new Iterator();
    }

    public Map<String, String> dataset() {
        return null;
    }
}

}