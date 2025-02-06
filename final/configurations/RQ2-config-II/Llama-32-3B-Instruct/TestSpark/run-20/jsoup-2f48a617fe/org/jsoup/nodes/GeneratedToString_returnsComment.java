package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedToString_returnsComment {

    @Test
    public void toString_returnsComment() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String toString = comment.toString();
        // Assert
        assertThat(toString, is("<!-- data -->"));
    }

}