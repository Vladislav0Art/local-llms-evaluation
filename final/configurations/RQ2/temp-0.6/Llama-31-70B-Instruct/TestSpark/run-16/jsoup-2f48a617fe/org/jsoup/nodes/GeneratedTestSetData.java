package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTestSetData {

    @Test
    public void testSetData() {
        Comment comment = new Comment("comment");
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

}