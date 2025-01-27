package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Parser parser;

    @Test
    public void newComment_ReturnsNewInstance() {
        Comment comment = Comment.create("data");
        assertNotNull(comment);
        assertSame(comment, comment.clone());
    }

    @Test
    public void nodeName_returnsNodeName() {
        Comment comment = Comment.create("data");
        when(out.accum).thenReturn(accum);
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getData_returnsData() {
        Comment comment = Comment.create("data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void setData_setsData() {
        Comment comment = Comment.create("");
        when(accum.append(anyString())).thenAnswer(inv -> inv);
        comment.setData("data");
        assertTrue(accum.appendCalledWith("data"));
    }

    @Test
    public void outerHtmlHead_appendsCommentTo_accum() throws Exception {
        Comment comment = Comment.create("data");
        accum.append("");
        when(out.accum).thenReturn(accum);
        comment.outerHtmlHead(out, 0, parser);
        assertEquals("<!-- data -->", accum.toString());
    }

    @Test
    public void outerHtmlTail_doesNotAppendAnything() throws Exception {
        Comment comment = Comment.create("");
        accum.append("");
        when(out.accum).thenReturn(accum);
        comment.outerHtmlTail(out, 0, parser);
        assertEquals("", accum.toString());
    }

    @Test
    public void toString_returnsXmlDeclaration() {
        Comment comment = Comment.create("data");
        assertEquals("<!-- data -->", comment.toString());
    }

    @Test
    public void clone_CreatesNewComment() {
        Comment comment = Comment.create("data");
        Comment actualComment = comment.clone();
        assertNotNull(actualComment);
        assertSame(comment, actualComment);
    }

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = Comment.create("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isNullIfNotXmlDeclaration_returnsFalse() {
        Comment comment = Comment.create("data");
        assertFalse(comment.isNullIfNotXmlDeclaration());
    }

}