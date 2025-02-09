package org.jsoup.nodes;

public class GeneratedTestDocumentHasCharset {

    @Test
    public void testDocumentHasCharset() throws Exception {
        Document document = new Document();
        String content = "Sample HTML Content";
        String baseUrl = "https://example.com";

        DocumentGenerator.generateDocument(content, baseUrl).setContent(content);
        DocumentGenerator.generateDocument(content, baseUrl).setBaseUrl(baseUrl);

        Element element = new Element();
        element.setTagName("html");
        element.getAttributes().add("lang");

        when(element.charset()).thenReturn(DataUtil.DEFAULT_CHARSET_VALUE);

        assertEquals(DataUtil.getDefaultCharset(), document.getCharset());
    }

}