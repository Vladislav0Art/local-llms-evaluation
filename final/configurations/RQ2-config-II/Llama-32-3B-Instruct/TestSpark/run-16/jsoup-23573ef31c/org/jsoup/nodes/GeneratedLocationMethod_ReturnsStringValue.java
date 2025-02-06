package org.jsoup.nodes;

public class GeneratedLocationMethod_ReturnsStringValue {

    @Test
    public void locationMethod_ReturnsStringValue() {
        Document doc = Document.createShell("");
        String location = doc.location();
        assertNotNull(location);
        assertTrue(!location.isEmpty());
    }

}