package org.jsoup.nodes;

public class GeneratedHeadTest {

    private Document document;

    @Test
    public void headTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document.head());
    }

}