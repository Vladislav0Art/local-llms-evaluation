package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void newComment() {
        Comment comment = new Comment("This is a test");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a test", comment.getData());
    }

    @Test
    public void newComment_withEmptyData() {
        Comment comment = new Comment("");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("", comment.getData());
    }

    @Test
    public void set_data() {
        Comment comment = new Comment("This is a test");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

    @Test
    public void outerHtmlHead_commentOnly() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--This is a test-->");
    }

    @Test
    public void outerHtmlTail_commentOnly() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

    @Test
    public void outerHtmlHead_commentWithSibling() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        Element sibling = mock(Element.class);
        comment.parentNode = sibling;
        comment.siblingIndex = 0;
        comment.outerHtmlHead(accum, 0, out);
        verify(accum).append("<!--This is a test-->");
    }

    @Test
    public void outerHtmlTail_commentWithSibling() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        Comment comment = new Comment("This is a test");
        Element sibling = mock(Element.class);
        comment.parentNode = sibling;
        comment.siblingIndex = 0;
        comment.outerHtmlTail(accum, 0, out);
        verify(accum, never()).append(anyString());
    }

    @Test
    public void clone_comment() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals("#comment", clonedComment.nodeName());
        assertEquals(comment.getData(), clonedComment.getData());
    }

    @Test
    public void isXmlDeclaration_test1() {
        Comment comment = new Comment("This is a test");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclaration_test2() {
        Comment comment = new Comment("  ");
        assertFalse(comment.isXmlDeclaration());
    }
}

class Appendable extends java.io.PrintWriter {

    private static final long serialVersionUID = 1L;

    public void append(String str) throws IOException {
        super.print(str);
    }

    public void append(char c) throws IOException {
        super.print(c);
    }
}

class Element {
    private String tag;

    public String tagName() {
        return tag;
    }

    protected void setTag(String tag) {
        this.tag = tag;
    }

}