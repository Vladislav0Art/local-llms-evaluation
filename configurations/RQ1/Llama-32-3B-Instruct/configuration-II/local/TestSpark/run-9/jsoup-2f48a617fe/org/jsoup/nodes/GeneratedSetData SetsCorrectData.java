package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetData SetsCorrectData {

    @Test
    public void setData

    SetsCorrectData() {
        String data = "Some data";
        Comment comment = new Comment(data);
        comment.setData("Another data");
        assertEquals("Another data", comment.getData());
    }

}