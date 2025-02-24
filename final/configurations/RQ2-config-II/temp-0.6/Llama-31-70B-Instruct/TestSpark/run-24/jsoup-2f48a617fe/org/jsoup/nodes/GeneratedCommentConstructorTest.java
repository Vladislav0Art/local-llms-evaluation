package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String testData = "test data";
        Comment comment = new Comment(testData);
        assertEquals(comment.getData(), testData);
    }

}