package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("testdata");
        Comment clone = comment.clone();
        assertEquals(comment.getData(), clone.getData());
        assertNotSame(comment, clone);
    }

}