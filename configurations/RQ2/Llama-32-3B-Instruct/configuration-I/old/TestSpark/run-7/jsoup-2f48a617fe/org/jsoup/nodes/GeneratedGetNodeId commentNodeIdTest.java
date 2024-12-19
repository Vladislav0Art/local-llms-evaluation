package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedGetNodeId commentNodeIdTest {

    @Test
    public void getNodeId

    commentNodeIdTest() {
        Comment comment = new Comment("test");
        assertEquals("", comment.nodeName());
    }

}