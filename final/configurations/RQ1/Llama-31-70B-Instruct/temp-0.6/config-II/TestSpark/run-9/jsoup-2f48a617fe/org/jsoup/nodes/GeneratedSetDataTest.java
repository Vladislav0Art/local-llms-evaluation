package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = Mockito.mock(Comment.class);
        Mockito.doReturn(null).when(comment).setData("testData");

        comment.setData("testData");
        Mockito.verify(comment).setData("testData");
    }

}