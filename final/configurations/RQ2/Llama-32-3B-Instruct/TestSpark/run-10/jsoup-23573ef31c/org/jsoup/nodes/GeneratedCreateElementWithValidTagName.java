package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedCreateElementWithValidTagName {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void createElementWithValidTagName() {
        String tagName = "div";
        Element div = new Element(tagName).createElement();
        assertNotNull(div);
    }
}

public class Connection {
}

public class Document {
    private String uri;

    public Document(String uri) {
        this.uri = uri;
    }

    public static Document createShell(String url) {
        // Implementation
    }

    public String location() {
        return uri;
    }

    public String getTitle() {
        return null;
    }
}

public class Element {
    private String uri;

    public Element(String uri) {
        this.uri = uri;
    }

    public FormElement expectForm(String cssQuery) {
        // Implementation
        return null;
    }

    public Element createElement(String tagName) {
        // Implementation
        return null;
    }
}

}