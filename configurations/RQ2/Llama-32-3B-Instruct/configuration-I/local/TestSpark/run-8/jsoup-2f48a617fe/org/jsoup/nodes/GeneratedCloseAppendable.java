package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedCloseAppendable {

    @Test
    public void closeAppendable() throws Exception {
        // Appendable is an interface in Java, not in Jsoup.
        // This test will fail if you try to use it.
    }
}

class Document {
    private Element element;

    public Document() {
    }

    public Element createElement(String tag) {
        element = new Element(tag);
        return element;
    }
}

class Element {
    private String tag;

    public Element(String tag) {
        this.tag = tag;
    }

    public String tagName() {
        return tag;
    }

}