package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedClone_returnsSameInstance {

    @Test
    public void clone_returnsSameInstance() {
        Comment comment = new Comment("Hello World!");
        Comment clonedComment = new Comment(comment.clone());
        assertEquals(comment, clonedComment);
    }

}