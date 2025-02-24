package org.jsoup.nodes;

public class GeneratedFormsTest {

    private Document document;

    @Test
    public void formsTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document.forms());
    }

}