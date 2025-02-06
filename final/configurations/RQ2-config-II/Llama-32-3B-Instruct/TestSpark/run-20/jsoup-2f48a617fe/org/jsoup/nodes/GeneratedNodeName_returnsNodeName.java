package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNodeName_returnsNodeName {

    @Test
    public void nodeName_returnsNodeName() {
        // Arrange & Act
        Comment comment = new Comment("data");
        String nodeName = comment.nodeName();
        // Assert
        assertThat(nodeName, is("COMMENT"));
    }

}