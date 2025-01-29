package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead {

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
    public void testOuterHtmlHead() throws IOException {
        String expected = "<!--<![CDATA[\ncomment\n <![CDATA[example]]> --]]>";
        Mockito.when(parser.parse(String.class)).thenReturn(document);
        document.outerHtmlHead(Mockito.any(Appendable.class), 0, ParseSettings.DEFAULT);
        assertEquals(expected, document.outerHtml());
    }

}