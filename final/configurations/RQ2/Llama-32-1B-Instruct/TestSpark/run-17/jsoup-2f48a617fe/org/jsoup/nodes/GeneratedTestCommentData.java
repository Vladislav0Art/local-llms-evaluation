package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestCommentData {

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private Parser parser;

    private Document document;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        ParseSettings parseSettings = new ParseSettings();
        Parser parser = new Parser(parseSettings);
        document = parser.parse("<example>comment</example>");
    }

    @Test
    public void testCommentData() {
        assertEquals("example", comment.getData());
    }

}