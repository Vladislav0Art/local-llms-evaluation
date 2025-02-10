package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

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
    public void testAsXmlDeclaration() {
        comment = new Comment("<!xml version=\"1.0\" encoding=\"utf-8\"?></xml>");
        comment = comment.asXmlDeclaration();
        assertEquals("<!xml version=\"1.0\" encoding=\"utf-8\"?", comment.getData());
    }

}