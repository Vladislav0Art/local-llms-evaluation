package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedSetDataSetsNewValue {

    @Test
    public void setDataSetsNewValue() {
        Comment comment = new Comment("old data");
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

}