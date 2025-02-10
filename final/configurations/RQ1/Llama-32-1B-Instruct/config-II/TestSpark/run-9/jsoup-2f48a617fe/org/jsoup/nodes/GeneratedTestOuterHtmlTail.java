package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

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
    public void testOuterHtmlTail() {
        append("", "");
        assertTrue(comment.outerHtmlTail().isEmpty());
    }

    private void indent(StringBuilder expectedOutput, int depth) {
        for (int i = 0; i < depth; i++) {
            expectedOutput.append("    ");
        }
    }

    private void append(String value, int maxLines) {
        if (value.length() > maxLines) {
            throw new IllegalArgumentException("Value is too long");
        }
        System.out.println(value);
    }

}