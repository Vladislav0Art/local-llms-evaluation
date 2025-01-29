package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

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
    public void testCommentNodeName() {
        assertEquals("Comment", comment.nodeName());
    }

    @Test
    public void testCommentData() {
        assertEquals("example", comment.getData());
    }

    @Test
    public void testCommentsetData() {
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        String expected = "<!--<![CDATA[\ncomment\n <![CDATA[example]]> --]]>";
        Mockito.when(parser.parse(String.class)).thenReturn(document);
        document.outerHtmlHead(Mockito.any(Appendable.class), 0, ParseSettings.DEFAULT);
        assertEquals(expected, document.outerHtml());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        String expected = "<!--<![CDATA[\ncomment\n <![CDATA[example]]> --]]>";
        Mockito.when(parser.parse(String.class)).thenReturn(document);
        document.outerHtmlHead(Mockito.any(Appendable.class), 0, ParseSettings.DEFAULT);
        document.outerHtmlTail(Mockito.any(Appendable.class), 0, ParseSettings.DEFAULT);
        assertEquals(expected, document.outerHtml());
    }

    @Test
    public void testToString() {
        String expected = "comment";
        Mockito.when(parser.parse(String.class)).thenReturn(document);
        assertEquals(expected, comment.toString());
    }

}