package org.jsoup.nodes;

public class GeneratedTestDocumentHasTitle {

    @Test
    public void testDocumentHasTitle() throws Exception {
        Document document = new Document();
        String content = "Sample HTML Content";
        String baseUrl = "https://example.com";

        DocumentGenerator.generateDocument(content, baseUrl).setContent(content);
        DocumentGenerator.generateDocument(content, baseUrl).setBaseUrl(baseUrl);

        Element element = new Element();
        element.setTagName("html");
        element.getAttributes().add("lang");

        document.setBaseUrl(baseUrl);

        when(element.title(anyString())).thenReturn("Sample HTML Title");

        assertEquals(document.getTitle(), "Sample HTML Title");
    }

}