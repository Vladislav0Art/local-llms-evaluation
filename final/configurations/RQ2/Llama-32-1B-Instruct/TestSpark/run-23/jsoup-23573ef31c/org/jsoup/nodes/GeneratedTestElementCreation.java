package org.jsoup.nodes;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() {
        Element element = document.createElement("div");
        assertNotNull(element);
        assertEquals("<div>", element.outerHtml());
    }

}