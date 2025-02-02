package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedClone_test {

    @Test
    public void clone_test() {
        Comment comment = new Comment("");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

}