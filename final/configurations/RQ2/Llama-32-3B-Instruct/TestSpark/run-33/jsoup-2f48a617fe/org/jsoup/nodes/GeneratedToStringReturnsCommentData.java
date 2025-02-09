package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedToStringReturnsCommentData {

    @Test
    public void toStringReturnsCommentData() {
        String data = "data";
        Comment comment = new Comment(data);
        assertEquals("<!-- " + data + " -->", comment.toString());
    }

}