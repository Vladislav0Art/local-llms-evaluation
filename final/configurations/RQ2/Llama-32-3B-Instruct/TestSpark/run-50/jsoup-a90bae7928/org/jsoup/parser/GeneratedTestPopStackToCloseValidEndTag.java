package org.jsoup.parser;

public class GeneratedTestPopStackToCloseValidEndTag {

    @Mock
    private Reader inputReader;

    @Mock
    private String baseUri;

    @Mock
    private Parser parser;

    @Mock
    private ParseSettings parseSettings;

    public void setup() {
    }

    @Test
    public void testPopStackToCloseValidEndTag() {
        boolean result = popStackToClose(parser);
        assertTrue(result);
    }

}