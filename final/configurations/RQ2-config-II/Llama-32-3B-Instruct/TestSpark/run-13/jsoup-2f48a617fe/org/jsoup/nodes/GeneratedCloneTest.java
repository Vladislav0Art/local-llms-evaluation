package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotEquals(comment, clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}