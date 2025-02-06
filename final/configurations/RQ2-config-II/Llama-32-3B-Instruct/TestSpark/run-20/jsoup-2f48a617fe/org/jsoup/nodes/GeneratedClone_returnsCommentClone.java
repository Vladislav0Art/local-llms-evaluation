package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedClone_returnsCommentClone {

    @Test
    public void clone_returnsCommentClone() {
        // Arrange
        Comment comment = new Comment("");
        Comment clone = comment.clone();
        // Assert
        assertThat(clone.getData(), is(""));
    }

}