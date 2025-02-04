package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDataGetMethodReturnsDataForComment {

    @Test
    public void DataGetMethodReturnsDataForComment() {
        Comment comment = new Comment("Test");
        String data = comment.getData();
        assertEquals("Test", data);
    }

}