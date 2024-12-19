package org.jsoup.parser;

public class GeneratedTestInitialiseParse {

    @Test
    public void testInitialiseParse() {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        htmlTreeBuilder.initialiseParse(new InputStreamReader(System.in), "", null);

        String baseUri = "https://example.com";
        Element parser = htmlTreeBuilder.parseFragment("", null, baseUri, null);
        assertEquals("https://example.com", parser.getBaseUri());
    }

}