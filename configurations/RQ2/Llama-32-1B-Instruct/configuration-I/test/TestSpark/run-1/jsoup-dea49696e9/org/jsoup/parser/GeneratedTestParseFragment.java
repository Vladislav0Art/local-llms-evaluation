package org.jsoup.parser;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() throws Exception {
        HtmlTreeBuilder htmlTreeBuilder = new HtmlTreeBuilder();
        String inputFragment = "<div><p>Some text</p></div>";
        Element context = null;
        ParseSettings defaultSettings = htmlTreeBuilder.defaultSettings();

        List<Node> nodes = htmlTreeBuilder.parseFragment(inputFragment, context, "https://example.com", defaultSettings);
        assertEquals(1, nodes.size());
    }

}