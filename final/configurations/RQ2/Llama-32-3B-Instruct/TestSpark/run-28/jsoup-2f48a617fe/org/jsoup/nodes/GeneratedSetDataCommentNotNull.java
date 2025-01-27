package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetDataCommentNotNull {

    @Test
    public void setDataCommentNotNull() {
        Comment comment = new Comment("data");
        comment.setData("newData");
        assertNotNull(comment.getData());
    }

}