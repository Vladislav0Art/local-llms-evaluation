package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testGetData() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("test data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!test");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("<test>");
        assertNotNull(comment.asXmlDeclaration());
    }

}