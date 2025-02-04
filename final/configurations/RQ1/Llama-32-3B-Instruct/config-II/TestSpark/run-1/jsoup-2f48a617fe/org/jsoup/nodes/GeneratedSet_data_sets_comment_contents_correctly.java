package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSet_data_sets_comment_contents_correctly {

    @Test
    public void set_data_sets_comment_contents_correctly() {
        Comment comment = new Comment("This is a comment");
        comment.setData("New comment data");
        assertEquals("New comment data", comment.getData());
    }

}