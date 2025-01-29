package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestToString {

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
    public void testToString() {
        String expected = "comment";
        Mockito.when(parser.parse(String.class)).thenReturn(document);
        assertEquals(expected, comment.toString());
    }

}