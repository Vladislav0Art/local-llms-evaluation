package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCloneTest {

    // Testing constructor and constructors related methods

    @Test
    public void cloneTest() {
        Comment comment = new Comment("test comment");
        Comment clonedComment = comment.clone();
        assertNotEquals(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}