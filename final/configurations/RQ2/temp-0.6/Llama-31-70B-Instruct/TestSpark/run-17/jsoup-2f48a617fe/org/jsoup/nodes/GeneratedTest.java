package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.Appendable;

public class GeneratedTest {

    @Test
    public void testCommentConstructor_WhenDataIsNull() {
        Comment comment = new Comment(null);
        assertEquals("", comment.getData());
    }

    @Test
    public void testCommentConstructor_WhenDataIsNotNull() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void testNodeName_WhenDataIsNull() {
        Comment comment = new Comment(null);
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testNodeName_WhenDataIsNotNull() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData_WhenDataIsNull() {
        Comment comment = new Comment(null);
        assertEquals("", comment.getData());
    }

    @Test
    public void testGetData_WhenDataIsNotNull() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData_WhenDataIsNull() {
        Comment comment = new Comment(null);
        comment.setData("test");
        assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData_WhenDataIsNotNull() {
        Comment comment = new Comment("test");
        comment.setData("new test");
        assertEquals("new test", comment.getData());
    }

}