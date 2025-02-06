package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String data = "New comment data";
        Comment comment = new Comment("");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}