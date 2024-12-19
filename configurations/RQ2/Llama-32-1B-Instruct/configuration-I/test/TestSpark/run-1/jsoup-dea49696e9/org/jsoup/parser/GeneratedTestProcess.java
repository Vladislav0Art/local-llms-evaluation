package org.jsoup.parser;

public class GeneratedTestProcess {

    @Test
    public void testProcess() throws Exception {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        String inputFragment = "<p>This is a paragraph</p>";
        Element context = null;
        Element parser = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", parseSettings);

        boolean processed = htmlTreeBuilder.process(parser);
        assertTrue(processed);
    }

}