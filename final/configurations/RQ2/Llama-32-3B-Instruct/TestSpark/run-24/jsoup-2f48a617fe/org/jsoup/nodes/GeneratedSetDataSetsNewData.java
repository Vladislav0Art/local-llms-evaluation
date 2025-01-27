package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSetDataSetsNewData {

    @Test
    public void setDataSetsNewData() {
        Comment comment = new Comment("");
        comment.setData("new_data");
        assertEquals("new_data", comment.getData());
    }

}