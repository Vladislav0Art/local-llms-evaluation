package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testGeneratedDocument() throws Exception {
        Document document = new Document();
        String content = "Sample HTML Content";
        String baseUrl = "https://example.com";

        DocumentGenerator.generateDocument(content, baseUrl).setContent(content);
        DocumentGenerator.generateDocument(content, baseUrl).setBaseUrl(baseUrl);

        Element element = new Element();
        element.setTagName("html");
        element.getAttributes().add("lang");

        when(element.constructor(anyString())).thenReturn(element);
    }

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