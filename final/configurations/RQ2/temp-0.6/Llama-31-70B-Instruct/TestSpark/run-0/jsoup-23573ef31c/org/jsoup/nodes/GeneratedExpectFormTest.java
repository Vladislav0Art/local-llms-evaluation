package org.jsoup.nodes;

public class GeneratedExpectFormTest {

    private Document document;

    @Test
    public void expectFormTest() {
        document = new Document("http://www.example.com");
        assertThrows(IllegalArgumentException.class, () -> document.expectForm(""));
    }

}