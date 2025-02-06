package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedSetData_setsData {

    @Test
    public void setData_setsData() {
        // Arrange & Act
        Comment comment = new Comment("");
        comment.setData("newData");
        String data = comment.getData();
        // Assert
        assertThat(data, is("newData"));
    }

}