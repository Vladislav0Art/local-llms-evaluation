package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest_className {

    public String html() {
        return "<html><body>Hello, World!</body></html>";
    }

    public static Element createElement(String tagName) {
        return document.createElement(tagName);
    }

    public void addClass(String className, Element elem) {
        elem.className(className);
    }

    public String removeClassName(String className) {
        return elem.className().replaceAll(className, "");
    }

    @Test
    public void test_className() {
        Element elem = createElement("div").addClass("primary", "secondary");
        assertEquals("primary secondary", elem.className());
    }

}