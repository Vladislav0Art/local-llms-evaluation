package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCommentDataShouldBeEqual {

    @Test
    public void commentDataShouldBeEqual() {
        Comment comment1 = new Comment();
        comment1.setData("comment1 data");
        Comment comment2 = new Comment();
        comment2.setData("comment1 data");
        assertEquals(comment1.getData(), comment2.getData());
    }

}