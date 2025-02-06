package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.any;

public class GeneratedTest {

    @Test
    public void newComment_hasEmptyData() {
        Comment comment = new Comment("");
        assertTrue(comment.getData().isEmpty());
    }

    @Test
    public void newComment_returnsCorrectName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void clone_returnsSameInstance() {
        Comment original = new Comment("data");
        Comment cloned = original.clone();
        assertSame(original, cloned);
    }

    @Test
    public void isXmlDeclaration_returnsTrue() {
        Comment comment = new Comment("");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsNullForEmptyComment() {
        Comment comment = new Comment("");
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void asXmlDeclaration_returnsXmlDeclarationForNotEmptyComment() throws IOException {
        Comment comment = new Comment("data");
        XmlDeclaration declaration = Mockito.mock(XmlDeclaration.class);
        Mockito.when(comment.asXmlDeclaration()).thenReturn(declaration);
        assertEquals(declaration, comment.asXmlDeclaration());
    }

    @Test
    public void outerHtmlHead_calledWithDefaultSettings() throws IOException {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append(anyString());
    }

    @Test
    public void outerHtmlTail_calledWithDefaultSettings() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append(anyString());
    }

    @Test
    public void toString_returnsCorrectString() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.toString());
    }

}