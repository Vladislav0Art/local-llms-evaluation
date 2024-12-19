package org.jsoup.nodes;

public class GeneratedTestGetData {

    private static final Comment COMMENT = new Comment("This is an example comment");

    @Test
    public void testGetData() {
        assertEquals("This is an example comment", COMMENT.getData());
    }

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Parser parser;

    @Before
    public void setUp() throws IOException, InterruptedException {
        parseSettings = new ParseSettings();
        parser = Parser.htmlParser().settings(parseSettings).parseInput("<!-- This is an example comment -->", "baseuri");
    }

}