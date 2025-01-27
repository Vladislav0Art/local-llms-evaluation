package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNodeNameIsAlwaysComment {

    @Test
    public void nodeNameIsAlwaysComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}