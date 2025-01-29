package org.jsoup.nodes;

public class GeneratedTestLocation {

    @Test
    public void testLocation() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        assertEquals("http://example.com", document.location());
    }

}