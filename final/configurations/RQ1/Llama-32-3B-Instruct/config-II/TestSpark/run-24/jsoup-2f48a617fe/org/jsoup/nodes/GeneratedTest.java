package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void CommentConstructorWithDataNotNull() {
        Comment comment = new Comment("Test");
        assertNotNull(comment);
    }

    @Test
    public void CommentConstructorsWithEmptyDataReturnsNullValue() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void NodeNameCommentShouldReturnCommentName() {
        Comment comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void DataGetMethodReturnsDataForComment() {
        Comment comment = new Comment("Test");
        String data = comment.getData();
        assertEquals("Test", data);
    }

    @Test
    public void setDataMethodUpdatesDataForComment() {
        Comment comment = new Comment("Old");
        comment.setData("New");
        assertEquals("New", comment.getData());
    }

    @Test
    public void outerHtmlHeadAppendsCommentToAccumulatorWithIndent() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--Test-->", accum.toString());
    }

    @Test
    public void outerHtmlHeadDoesNotAppendIfPrettyPrintIsDisabledAndNoSibling() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(false);
        when(comment.siblingIndex()).thenReturn(1);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void outerHtmlTailDoesNotAppendAnything() {
        Appendable accum = Mockito.mock(Appendable.class);
        Comment comment = new Comment("Test");
        int depth = 0;
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        comment.outerHtmlHead(accum, depth, out);
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void cloneMethodReturnsSameComment() {
        Comment comment = new Comment("Test");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

    @Test
    public void isXmlDeclarationReturnsFalseIfDataStartsWithQuestionMark() {
        Comment comment = new Comment("?xml version \"1.0\"");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationReturnsFalseIfDataLengthIsLessThanTwo() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullWhenCannotBeParsedAsXmlDeclaration() {
        Comment comment = new Comment("Test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

    @Test
    public void asXmlDeclarationParsesDataWhenItIsAnXmlDeclaration() {
        Comment comment = new Comment("<?xml version=\"1.0\"?><test></test>");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
    }

}