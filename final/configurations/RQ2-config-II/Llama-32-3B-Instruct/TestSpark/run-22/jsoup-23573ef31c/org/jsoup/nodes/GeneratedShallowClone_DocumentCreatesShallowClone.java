package org.jsoup.nodes;

public class GeneratedShallowClone_DocumentCreatesShallowClone {

    @Test
    public void shallowClone_DocumentCreatesShallowClone() {
        Document document = new Document("https://example.com");
        Document clone = document.shallowClone();
        assertNotNull(clone);
    }

}