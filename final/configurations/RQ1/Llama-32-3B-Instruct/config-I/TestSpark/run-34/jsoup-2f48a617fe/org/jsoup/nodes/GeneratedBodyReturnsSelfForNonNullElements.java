package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedBodyReturnsSelfForNonNullElements {

    @Test
    public void bodyReturnsSelfForNonNullElements() {
        Element element = new Element();
        assertEquals(element, element.body());
    }
}

class Comment extends org.jsoup.nodes.Element {
    public Comment(String data) {
        super(data);
    }

    @Override
    public String toString() {
        return "#comment";
    }
}

class Document extends org.jsoup.nodes.Document {

    public static Document of(org.jsoup.nodes.Element element) {
        return new Document(element);
    }
}

class Element extends org.jsoup.nodes.Element {
    public Element(String data) {
        super(data);
    }

    @Override
    public String toString() {
        return "some data";
    }

    public void outerHtmlHead(java.lang.StringBuilder buffer, int depth, java.lang.Object indent) {
        // implementation
    }
}

}