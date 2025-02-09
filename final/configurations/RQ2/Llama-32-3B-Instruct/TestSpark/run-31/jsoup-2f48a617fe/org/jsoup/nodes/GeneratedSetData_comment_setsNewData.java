package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedSetData_comment_setsNewData {

    @Test
    public void setData_comment_setsNewData() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

}