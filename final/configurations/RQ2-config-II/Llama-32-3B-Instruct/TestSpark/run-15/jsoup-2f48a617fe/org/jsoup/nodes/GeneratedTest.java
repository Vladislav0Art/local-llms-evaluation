package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        String data = "Comment data";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        Comment comment = new Comment("Comment data");
        assertEquals("Comment data", comment.getData());
    }

    @Test
    public void setDataTest() {
        String data = "New comment data";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        verify(accum).append("\n<!--");
    }

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getOutputMode()).thenReturn(Document.OutputMode.HTML);
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        verify(accum).append("-->\n");
    }

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Comment data");
        assertEquals("<!--comment-->", comment.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationTest() {
        Comment comment = new Comment("Comment data");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        Comment comment = new Comment("");
        assertNotNull(comment.asXmlDeclaration());
        assertEquals("", comment.asXmlDeclaration().getData());
    }

}