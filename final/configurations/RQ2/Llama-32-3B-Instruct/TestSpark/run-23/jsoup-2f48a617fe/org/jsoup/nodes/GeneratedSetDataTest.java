package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment(null);
        String data = "newData";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}