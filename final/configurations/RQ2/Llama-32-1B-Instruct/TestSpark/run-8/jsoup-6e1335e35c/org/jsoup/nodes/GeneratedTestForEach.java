package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestForEach {

    @Test
    public void testForEach() {
        Document document = new Document();
        Element element = document.createElement("html");
        document.appendChild(element);
        String html = "<p>Hello World!</p>";
        parser.parseString(html, element);
        assertTrue(document.getInnerHTML().contains("<span>This is a test</span>"));
    }

}