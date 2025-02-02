package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void newCommentWithData_ReturnsComment() {
        Comment comment = new Comment("some data");
        assertEquals("some data", comment.getData());
    }

    @Test
    public void newNodeWithCommentData_DataIsRetrievedFromNode() {
        Comment comment = new Comment("some data");
        assertEquals("some data", comment.getData());
    }

    @Test
    public void setCommentsDataUpdatesNode() {
        Comment comment = new Comment("old data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void asStringReturnsEmptyForNullElements() {
        Element element = null;
        assertEquals("", element.toString());
    }

}