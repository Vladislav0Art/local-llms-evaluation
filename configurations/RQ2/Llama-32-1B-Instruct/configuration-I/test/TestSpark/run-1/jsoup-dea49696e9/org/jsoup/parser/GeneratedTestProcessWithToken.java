package org.jsoup.parser;

public class GeneratedTestProcessWithToken {

    @Test
    public void testProcessWithToken() throws Exception {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        String inputFragment = "<p>This is a paragraph</p>";
        Element context = null;
        Element parser = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", parseSettings);
        Token token = parser.getToken();

        boolean processed = htmlTreeBuilder.process(token);
        assertTrue(processed);
    }

}