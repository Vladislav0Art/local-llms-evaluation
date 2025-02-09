package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCloneReturnsSameObject {

    @Test
    public void testCloneReturnsSameObject() {
        // Arrange
        Comment comment = new Comment("data");

        // Act and Assert
        Comment clonedComment = comment.clone();
        assertSame(clonedComment, comment);
    }

}