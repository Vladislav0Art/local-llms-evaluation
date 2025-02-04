package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetDataSetsCorrectData {

    @Test
    public void setDataSetsCorrectData() {
        String data = "test";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}