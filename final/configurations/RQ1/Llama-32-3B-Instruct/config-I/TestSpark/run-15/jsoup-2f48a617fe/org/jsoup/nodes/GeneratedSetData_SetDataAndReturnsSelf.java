package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSetData_SetDataAndReturnsSelf {

    @Test
    public void setData_SetDataAndReturnsSelf() {
        Comment comment = new Comment("This is a comment");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
        comment = comment.setData("Another data");
        assertEquals("Another data", comment.getData());
    }

}