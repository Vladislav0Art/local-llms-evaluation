package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData() {
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("", accum.toString());
    }

    @Test
    public void testToString() {
        assertEquals("<!--test-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment clone = (Comment) comment.clone();
        assertNotNull(clone);
        assertEquals("test", clone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        assertEquals(false, comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        assertEquals(null, comment.asXmlDeclaration());
    }

}