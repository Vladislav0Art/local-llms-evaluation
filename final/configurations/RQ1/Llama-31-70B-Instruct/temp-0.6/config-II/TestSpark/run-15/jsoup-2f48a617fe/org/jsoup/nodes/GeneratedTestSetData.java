package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("test");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}