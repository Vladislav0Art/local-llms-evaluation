package org.jsoup.nodes;

public class GeneratedNodeNameShouldNotBeEmptyString {

    @Test
    public void nodeNameShouldNotBeEmptyString() {
        Document document = Document.createShell("https://example.com");
        String name = document.nodeName();
        assertFalse(name.isEmpty());
    }

}