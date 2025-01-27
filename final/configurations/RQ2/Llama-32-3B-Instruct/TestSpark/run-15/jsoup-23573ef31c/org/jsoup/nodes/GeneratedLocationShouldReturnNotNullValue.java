package org.jsoup.nodes;

public class GeneratedLocationShouldReturnNotNullValue {

    @Test
    public void locationShouldReturnNotNullValue() {
        Document document = Document.createShell("https://example.com");
        String location = document.location();
        assertNotNull(location);
    }

}