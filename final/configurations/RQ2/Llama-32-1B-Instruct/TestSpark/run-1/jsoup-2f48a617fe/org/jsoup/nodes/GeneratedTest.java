package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserDelegate;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testCommentNodeName() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void testCommentData() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.getData());
    }

    @Test
    public void testCommentDataSet() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings parseSettings = Mockito.mock(ParseSettings.class);
        ParserDelegate delegate = Mockito.mock(ParserDelegate.class);

        when(parser.parseSettings()).thenReturn(parseSettings);
        when(delegate.parse()).thenReturn(true);

        Comment comment = new Comment("test");

        comment.outerHtmlHead(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class));
        assertEquals(comment, Mockito.verify(parser).parseSettings().nextNode());
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings parseSettings = Mockito.mock(ParseSettings.class);
        ParserDelegate delegate = Mockito.mock(ParserDelegate.class);

        when(parser.parseSettings()).thenReturn(parseSettings);
        when(delegate.parse()).thenReturn(true);

        Comment comment = new Comment("test");

        comment.outerHtmlTail(Mockito.any(Appendable.class), 0, Mockito.any(Document.OutputSettings.class));
        assertEquals(comment, Mockito.verify(parser).parseSettings().lastNode());
    }

    @Test
    public void testToString() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.toString());
    }

    @Test
    public void testClone() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals(comment, comment.clone());

        comment.setData(new String());
        assertEquals(comment, comment.clone());
    }

    @Test
    public void testIsXmlDeclaration() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() throws Exception {
        Parser parser = Mockito.mock(Parser.class);
        ParseSettings parseSettings = Mockito.mock(ParseSettings.class);
        ParserDelegate delegate = Mockito.mock(ParserDelegate.class);

        when(parser.parseSettings()).thenReturn(parseSettings);
        when(delegate.parse()).thenReturn(true);

        Comment comment = new Comment("test");
        comment.asXmlDeclaration();
        assertEquals("test", comment.asXmlDeclaration());
    }

}