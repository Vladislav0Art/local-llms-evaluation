package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedNewNodeDataNull_ReturnsNull {

    @Test
    public void newNodeDataNull_ReturnsNull() {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

}