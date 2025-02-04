package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNewComment_withEmptyData {

    @Test
    public void newComment_withEmptyData() {
        Comment comment = new Comment("");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("", comment.getData());
    }

}