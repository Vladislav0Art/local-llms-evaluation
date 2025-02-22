package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testNodeName() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.prettyPrint()).thenReturn(true);
        when(out.outline()).thenReturn(true);
        comment.outerHtmlHead(accum, 1, out);
        verify(accum).append("<!--test-->");
    }

    @Test
    public void testToString() {
        Comment comment = new Comment("test");
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment comment = new Comment("test");
        Comment clone = comment.clone();
        assertEquals("test", clone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("test");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("test");
        assertNull(comment.asXmlDeclaration());
    }

}