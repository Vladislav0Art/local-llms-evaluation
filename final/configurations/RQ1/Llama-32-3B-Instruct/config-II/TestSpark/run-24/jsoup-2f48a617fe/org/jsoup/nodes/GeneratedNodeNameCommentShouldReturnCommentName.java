package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeNameCommentShouldReturnCommentName {

    @Test
    public void NodeNameCommentShouldReturnCommentName() {
        Comment comment = new Comment("Test");
        assertEquals("#comment", comment.nodeName());
    }

}