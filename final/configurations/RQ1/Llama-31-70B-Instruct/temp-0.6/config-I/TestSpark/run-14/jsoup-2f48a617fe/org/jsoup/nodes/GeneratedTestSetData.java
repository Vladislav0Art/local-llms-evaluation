package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}