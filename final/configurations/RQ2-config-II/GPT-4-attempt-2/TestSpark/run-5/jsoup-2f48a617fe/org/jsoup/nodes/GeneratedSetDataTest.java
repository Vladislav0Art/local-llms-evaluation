package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "testdata";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}