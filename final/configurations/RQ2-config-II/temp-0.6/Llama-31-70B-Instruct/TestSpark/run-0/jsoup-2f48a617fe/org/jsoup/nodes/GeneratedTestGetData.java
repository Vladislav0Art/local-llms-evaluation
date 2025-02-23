package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetData {

    @Test
    public void testGetData() {
        Comment comment = new Comment("test data");
        String data = comment.getData();
        assertEquals("test data", data);
    }

}