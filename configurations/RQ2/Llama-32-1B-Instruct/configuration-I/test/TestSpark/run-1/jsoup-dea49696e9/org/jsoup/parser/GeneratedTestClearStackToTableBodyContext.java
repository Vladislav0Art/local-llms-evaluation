package org.jsoup.parser;

public class GeneratedTestClearStackToTableBodyContext {

    @Test
    public void testClearStackToTableBodyContext() throws Exception {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        ParseSettings parseSettings = htmlTreeBuilder.defaultSettings();

        String inputFragment = "<p>This is a paragraph</p>";
        Element context = null;
        Element parser = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", parseSettings);

        htmlTreeBuilder.clearStackToTableBodyContext(parser.getState());

        List<Node> nodes = htmlTreeBuilder.parseFragment("", null, "", parseSettings);
        assertEquals(1, nodes.size());
    }

}