package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestHtmlAttribute {

    @Test
    public void testHtmlAttribute() {
        Element element = new Element();
        element.setHtml("<p>Hello World</p>");
        assertEquals("<p>Hello World</p>", element.getHtml());
    }

}