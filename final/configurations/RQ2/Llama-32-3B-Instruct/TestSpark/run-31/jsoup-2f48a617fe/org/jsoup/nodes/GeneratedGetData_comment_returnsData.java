package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedGetData_comment_returnsData {

    @Test
    public void getData_comment_returnsData() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}