package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createCommentWithValidData_ReturnsComment() {
        Comment comment = new Comment("Hello World");
        assertNotNull(comment);
    }

    @Test
    public void nodeNameOfComment

    ReturnsExpectedValue() {
        Comment comment = new Comment("Hello World");
        assertEquals("COMMENT", comment.nodeName());
    }

    @Test
    public void getDataOfComment

    ReturnsExpectedData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

    @Test
    public void setDataOnCommentChangesDataCorrectly() {
        Comment comment = new Comment("");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHeadForEmptyCommentDoesNotAppendAnything() throws IOException {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("");
        comment.outerHtmlHead(appendable, 0, Document.OutputSettings.empty());
        assertEquals("", appendable.toString());
    }

    @Test
    public void outerHtmlTailForEmptyCommentDoesNotAppendAnything() {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("");
        comment.outerHtmlTail(appendable, 0, Document.OutputSettings.empty());
        assertEquals("", appendable.toString());
    }

    @Test
    public void outerHtmlHeadForCommentWithDataAppendsCorrectHtml() throws IOException {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlHead(appendable, 0, Document.OutputSettings.empty());
        assertEquals("<p>Hello World</p>", appendable.toString());
    }

    @Test
    public void outerHtmlTailForCommentWithDataAppendsCorrectHtml() {
        Appendable appendable = new ByteArrayOutputStream();
        Comment comment = new Comment("Hello World");
        comment.outerHtmlTail(appendable, 0, Document.OutputSettings.empty());
        assertEquals("<br>", appendable.toString());
    }

    @Test
    public void toStringOfComment

    ReturnsExpectedString() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.toString());
    }

    @Test
    public void cloneOfCommentReturnsSameInstance() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertSame(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationForEmptyComment_ReturnsTrue() {
        assertTrue(new Comment("").isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationForEmptyCommentReturnsNull() {
        assertNull(new Comment("").asXmlDeclaration());
    }

}