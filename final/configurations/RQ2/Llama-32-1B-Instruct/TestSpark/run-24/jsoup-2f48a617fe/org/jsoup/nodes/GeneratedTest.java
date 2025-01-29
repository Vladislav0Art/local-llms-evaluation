package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void nodeNameTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "This is a test comment";
        when(mockComment.nodeName()).thenReturn(data);

        assertEquals("This is a test comment", new Comment(data).nodeName());
    }

    @Test
    public void getDataTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        when(mockComment.getData()).thenReturn("test data");

        assertEquals("test data", new Comment(null).getData());
    }

    @Test
    public void setDataTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "test data";
        when(mockComment.setData(data)).thenReturn(data);

        assertEquals(data, new Comment(data).setData(data));
    }

    @Test
    public void outerHtmlHeadTest() {
        ParseSettings parseSettings = new ParseSettings();
        parseSettings.add("http://www.w3.org/1999/XLink", "xlink");
        String data = "This is a test comment";
        when(Mockito.mock(Parser.class)).thenReturn(parseSettings);

        new Comment(data).outerHtmlHead(Mockito.mock(Appendable.class), 0, Document.OutputSettings());
    }

    @Test
    public void outerHtmlTailTest() {
        ParseSettings parseSettings = new ParseSettings();
        parseSettings.add("http://www.w3.org/1999/XLink", "xlink");
        String data = "This is a test comment";
        when(Mockito.mock(Parser.class)).thenReturn(parseSettings);

        new Comment(data).outerHtmlTail(Mockito.mock(Appendable.class), 0, Document.OutputSettings());
    }

    @Test
    public void toStringTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "This is a test comment";
        when(mockComment.toString()).thenReturn(data);

        assertEquals(data, new Comment(null).toString());
    }

    @Test
    public void cloneTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        String data = "This is a test comment";
        when(mockComment.clone()).thenReturn(new Comment(data));

        assertEquals(new Comment(data), new Comment(null).clone());
    }

    @Test
    public void isXmlDeclarationTest() {
        MockComment mockComment = Mockito.mock(Comment.class);
        when(mockComment.isXmlDeclaration()).thenReturn(true);

        assertTrue(new Comment(null).isXmlDeclaration());
    }

}