package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCreateCommentWithValidData_ReturnsNewComment {

    @Test
    public void CreateCommentWithValidData_ReturnsNewComment() {
        Comment comment = new Comment("Hello, World!");
        assert comment != null;
    }

}