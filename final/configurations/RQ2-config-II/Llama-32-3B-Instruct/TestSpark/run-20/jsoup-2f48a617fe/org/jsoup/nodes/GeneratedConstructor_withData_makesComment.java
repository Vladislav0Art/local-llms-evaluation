package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedConstructor_withData_makesComment {

    @Test
    public void constructor_withData_makesComment() {
        // Arrange & Act
        String data = "data";
        Comment comment = new Comment(data);
        // Assert
        assertThat(comment.getData(), is(data));
    }

}