package org.jsoup.nodes;

public class GeneratedBodyElement_test {

    @Test
    public void bodyElement_test() {
        Document document = new Document("http://example.com");
        Element body = document.body();
        assertNotNull(body);
    }

}