package org.jsoup.nodes;

public class GeneratedTestTextSetsTextCorrectly {

    @Test
    public void testTextSetsTextCorrectly() {
        String originalText = "Hello World!";
        Document document = new Document("https://example.com");
        document.setText(originalText);
        assertEquals(originalText, document.getText());
    }

}