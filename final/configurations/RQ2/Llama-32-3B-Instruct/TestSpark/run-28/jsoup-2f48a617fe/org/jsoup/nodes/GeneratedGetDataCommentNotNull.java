package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedGetDataCommentNotNull {

    @Test
    public void getDataCommentNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment.getData());
    }

}