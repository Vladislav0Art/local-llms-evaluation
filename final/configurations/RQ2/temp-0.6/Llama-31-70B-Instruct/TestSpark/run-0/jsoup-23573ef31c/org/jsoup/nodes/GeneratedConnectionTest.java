package org.jsoup.nodes;

public class GeneratedConnectionTest {

    private Document document;

    @Test
    public void connectionTest() {
        document = new Document("http://www.example.com");
        assertNull(document.connection());
    }

}