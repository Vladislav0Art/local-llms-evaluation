package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNewNodeDataEmpty_ReturnsEmptyString {

    @Test
    public void newNodeDataEmpty_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}