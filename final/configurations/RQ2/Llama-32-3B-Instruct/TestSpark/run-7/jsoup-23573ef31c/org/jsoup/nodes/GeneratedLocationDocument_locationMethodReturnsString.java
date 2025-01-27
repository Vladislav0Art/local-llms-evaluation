package org.jsoup.nodes;

public class GeneratedLocationDocument_locationMethodReturnsString {

    @Test
    public void locationDocument_locationMethodReturnsString() {
        String expectedLocation = "https://example.com";
        Document document = new Document(expectedLocation);
        assertEquals(expectedLocation, document.location());
    }

}