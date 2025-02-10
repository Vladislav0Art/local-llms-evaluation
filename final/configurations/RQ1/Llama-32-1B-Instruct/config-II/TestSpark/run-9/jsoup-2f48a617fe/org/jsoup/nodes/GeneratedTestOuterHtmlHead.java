package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;

    @Before
    public void setup() {
        ParseSettings settings = new ParseSettings();
        settings.setKeepTrailingSlash(true);
        settings.setDefaultEncoding("utf-8");
        settings.setMode(ParseSettings.DEFAULT_MODE);
        Parser parser = new Parser(settings);

        String data = "<!-- This is a test comment -->";
        comment = new Comment(data);
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder expectedOutput = new StringBuilder();
        indent(expectedOutput, 0);
        append(expectedOutput, "<!-- This is a test comment -->");
        assertSame(expectedOutput.toString(), comment.outerHtml());
    }

}