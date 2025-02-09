package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.LeafNode;

public class GeneratedCommentDataSetsStringValue {

    @Test
    public void commentDataSetsStringValue() {
        String data = "newData";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}