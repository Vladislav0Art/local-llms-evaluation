package org.jsoup.nodes;

public class GeneratedShallowClone_test {

    @Test
    public void shallowClone_test() {
        Document document = new Document("http://example.com");
        Document clone = document.shallowClone();
        assertNotNull(clone);
        assertTrue(document.equals(clone));
    }

}