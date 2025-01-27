package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class GeneratedCommentConstructorWithoutDataShouldBeNull {

    @Test
    public void commentConstructorWithoutDataShouldBeNull() throws Exception {
        Comment comment = new Comment(null);
        assertNull(comment.getData());
    }

}