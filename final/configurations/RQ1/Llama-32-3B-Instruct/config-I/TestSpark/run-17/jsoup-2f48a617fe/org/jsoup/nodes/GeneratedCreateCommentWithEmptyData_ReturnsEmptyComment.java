package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCreateCommentWithEmptyData_ReturnsEmptyComment {

    @Test
    public void CreateCommentWithEmptyData_ReturnsEmptyComment() {
        Comment comment = new Comment("");
        assert comment.getData().isEmpty();
    }

}