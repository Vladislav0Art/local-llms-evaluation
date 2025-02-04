package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void CreateComment_ReturnsNewComment() {
        String data = "Hello, World!";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void CommentName_ReturnsCorrectValue() {
        Comment comment = new Comment("<!-- test -->");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void OuterHtmlHead_RestoreComment() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        int depth = 1;
        String expectedOutput = "<!--Hello, World!-->";
        Comment comment = new Comment("<!-- Hello, World! -->");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(accum.toString().contains(expectedOutput));
    }

    @Test
    public void OuterHtmlTail_DoesNothing() {
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        int depth = 1;
        Comment comment = new Comment("<!-- Hello, World! -->");
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(!accum.toString().contains("<!--"));
    }

    @Test
    public void Clone_ReturnsSameInstance() {
        Comment comment = new Comment("<!-- Hello, World! -->");
        Comment clone = comment.clone();
        assertEquals(comment, clone);
    }

    @Test
    public void IsXmlDeclaration_ReturnsTrueWhenDataStartsWithExclamationOrQuestionMark() {
        Comment comment = new Comment("!Hello, World!");
        assertTrue(comment.isXmlDeclaration());
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void IsXmlDeclaration_ReturnsFalseOtherwise() {
        Comment comment = new Comment("Hello, World!");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void AsXmlDeclaration_ReturnsNullWhenDataNotAnXmlDeclaration() {
        Comment comment = new Comment("!Hello, World!");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void AsXmlDeclaration_CreatesNewNode() {
        String data = "Hello, World!";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertEquals(data.substring(1, data.length() - 1), decl.getContent());
        assertEquals(data.startsWith("!"), decl.isDeclaration());
    }

}