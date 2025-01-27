package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCommentNodeNameShouldBeEqual {

    @Test
    public void commentNodeNameShouldBeEqual() {
        Comment comment1 = new Comment();
        comment1.setNodeName("comment1");
        Comment comment2 = new Comment();
        comment2.setNodeName("comment1");
        assertEquals(comment1.getNodeName(), comment2.getNodeName());
    }

}