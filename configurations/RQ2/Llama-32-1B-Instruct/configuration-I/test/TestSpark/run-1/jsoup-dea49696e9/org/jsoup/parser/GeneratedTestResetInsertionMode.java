package org.jsoup.parser;

public class GeneratedTestResetInsertionMode {

    @Test
    public void testResetInsertionMode() throws Exception {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        String inputFragment = "<p>This is a paragraph</p>";
        Element context = null;
        Element parser = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", parseSettings);

        htmlTreeBuilder.resetInsertionMode();

        List<Node> nodes = htmlTreeBuilder.parseFragment("", null, "", parseSettings);
        assertEquals(1, nodes.size());
    }

}