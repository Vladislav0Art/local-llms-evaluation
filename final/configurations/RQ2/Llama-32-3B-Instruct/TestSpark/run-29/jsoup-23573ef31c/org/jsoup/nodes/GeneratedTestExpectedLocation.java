package org.jsoup.nodes;

public class GeneratedTestExpectedLocation {

    public Document document;
    public Parser parser = new Parser();
    public QuirksMode quirksMode;

    @Test
    public void testExpectedLocation() {
        String expectedLocation = Jsoup.connect("https://example.com").get().location().toString();
        assertEquals(expectedLocation, "https://example.com");
    }

}