package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTestsCorrectCloneCreation {

    @Test
    public void cloneTestsCorrectCloneCreation() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = (Comment) comment.clone();
        assertNotNull(clonedComment);
    }

}