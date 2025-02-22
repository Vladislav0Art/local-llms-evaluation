package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("data");
        Comment commentClone = comment.clone();
        assertNotEquals(comment, commentClone);
        assertEquals(comment.getData(), commentClone.getData());
    }

}