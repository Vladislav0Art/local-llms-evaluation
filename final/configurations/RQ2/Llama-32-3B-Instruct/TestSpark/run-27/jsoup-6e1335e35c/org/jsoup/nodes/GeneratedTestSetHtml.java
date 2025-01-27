package org.jsoup.nodes;

public class GeneratedTestSetHtml {

    @Test
    public void testSetHtml() {
        Element element = new Element("");
        element.setHtml("<p>Hello World!</p>");
        assertEquals("<p>Hello World!</p>", element.getHtml());
    }
}

}