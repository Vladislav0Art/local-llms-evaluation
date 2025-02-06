package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedNodeNameElement_test {

    @Test
    public void nodeNameElement_test() {
        Element element = new Element("div");
        Document document = Document.createShell("http://example.com").createElement("div").element(element);
        String nodeName = document.nodeName();
        assertEquals(element.tagName(), nodeName);
    }

}