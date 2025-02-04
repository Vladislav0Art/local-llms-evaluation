package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void newCommentCreateTest() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void newCommentDataTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals(comment.getData(), "This is a comment");
    }

    @Test
    public void newCommentCloneTest() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertTrue(comment.isXmlDeclaration());
        assertFalse(clonedComment.isXmlDeclaration());
    }

    @Test
    public void outerHtmlHeadCommentContentTest() {
        Comment comment = new Comment("This is a comment");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlHead(appendable, depth, outputSettings);
        verify(appendable).append(eq("//<!--"));
        verify(appendable).append(eq("This is a comment"));
        verify(appendable).append(eq("-->"));
    }

    @Test
    public void outerHtmlHeadCommentBlockTagTest() {
        Comment comment = new Comment("This is a comment");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        Element parentNode = mock(Element.class);
        comment.outerHtmlHead(appendable, depth, outputSettings);
        verify(outputSettings).prettyPrint();
    }

    @Test
    public void outerHtmlTailNoCommentContentTest() {
        Comment comment = new Comment("");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(appendable, depth, outputSettings);
    }

    @Test
    public void outerHtmlTailCommentContentTest() {
        Comment comment = new Comment("This is a comment");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);
        int depth = 0;
        comment.outerHtmlTail(appendable, depth, outputSettings);
    }

    @Test
    public void toStringCommentContentTest() {
        Comment comment = new Comment("This is a comment");
        assertEquals(comment.toString(), "<!--This is a comment-->");
    }

    @Test
    public void cloneCommentSameDataTest() {
        Comment comment = new Comment("This is a comment");
        Comment clonedComment = comment.clone();
        assertEquals(comment.getData(), clonedComment.getData());
    }

}