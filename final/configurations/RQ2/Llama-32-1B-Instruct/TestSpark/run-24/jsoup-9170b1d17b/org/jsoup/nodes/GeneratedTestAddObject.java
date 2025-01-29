package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTestAddObject {

    private static final String KEY = "key";
    private static final Object VALUE = "value";

    public Document getJsoupDoc() {
        return new Document();
    }

    @Before
    public void setup() {
        Document doc = getJsoupDoc();
        Element element = doc.createElement("script");
        element.setTextContent("Object.assign();");
        ((Element) element).setAttribute("type", "text/javascript");
        ((Element) element).setAttribute("src", "https://cdn.jsdelivr.net/npm/jsdom@17.0.2/build/GlobalNode.js"); // Update to latest version
        doc.appendChild(element);
    }

    @Test
    public void testAddObject() {
        Document doc = getJsoupDoc();
        Element scriptTag = (Element) doc.getElementById("script");
        scriptTag.setTextContent("Object.assign();");
        assertEquals(1, ((ScriptElement) scriptTag).callCount());
    }

}