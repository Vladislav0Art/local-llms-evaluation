package org.jsoup.nodes;

public class GeneratedCreateElement_test {

    @Test
    public void createElement_test() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

}