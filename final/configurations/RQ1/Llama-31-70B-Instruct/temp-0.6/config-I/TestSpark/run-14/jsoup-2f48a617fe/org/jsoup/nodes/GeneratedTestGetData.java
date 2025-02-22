package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
    }

}