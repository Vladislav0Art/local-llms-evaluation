package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedGetData_returnsData {

    @Test
    public void getData_returnsData() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String data = comment.getData();
        // Assert
        assertThat(data, is("data"));
    }

}