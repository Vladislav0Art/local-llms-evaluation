package org.jsoup.nodes;

public class GeneratedTestShallowClone {

    @Test
    public void testShallowClone() {
        Document document1 = new Document("https://example.com");
        Document document2 = document1.shallowClone();
        assertEquals(document1, document2);
    }

}