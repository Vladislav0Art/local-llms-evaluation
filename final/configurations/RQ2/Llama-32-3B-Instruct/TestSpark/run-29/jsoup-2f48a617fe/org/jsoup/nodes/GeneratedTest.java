package org.jsoup.nodes;

import org.junit.Test;

import java.lang.reflect.Method;

public class GeneratedTest {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("CommentTests");
    }
}

import org.junit.Test;
import java.lang.reflect.Method;

public class CommentTests {

    @Test
    public void newNodeDataEmpty_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void newNodeDataNull_ReturnsNull() {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

    @Test
    public void setDataSetsNewValue() {
        Comment comment = new Comment("old data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void nodeNameIsAlwaysComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void asXmlDeclarationReturnsNullWhenDataIsNull() {
        Comment comment = new Comment(null);
        assertNull(comment.asXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationAlwaysFalse() {
        Comment comment = new Comment("");
        assertFalse(comment.isXmlDeclaration());
    }

}