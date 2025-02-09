package org.jsoup.nodes;

public class GeneratedTestDocumentHasTag {

    @Test
    public void testDocumentHasTag() throws Exception {
        Document document = new Document();
        String content = "Sample HTML Content";
        String baseUrl = "https://example.com";

        DocumentGenerator.generateDocument(content, baseUrl).setContent(content);
        DocumentGenerator.generateDocument(content, baseUrl).setBaseUrl(baseUrl);

        Element element = new Element();
        element.setTagName("html");
        element.getAttributes().add("lang");

        when(element.constructor(anyString())).thenReturn(element);

        assertTrue(document.hasTag(element));
    }

}