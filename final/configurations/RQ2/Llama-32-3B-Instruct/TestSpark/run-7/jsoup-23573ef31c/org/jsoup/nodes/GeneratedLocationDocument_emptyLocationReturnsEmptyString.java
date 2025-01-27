package org.jsoup.nodes;

public class GeneratedLocationDocument_emptyLocationReturnsEmptyString {

    @Test
    public void locationDocument_emptyLocationReturnsEmptyString() {
        String expectedLocation = "";
        Document document = new Document(expectedLocation);
        assertEquals(expectedLocation, document.location());
    }

}