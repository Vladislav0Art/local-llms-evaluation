package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCommentData {

    @Test
    public void testCommentData() {
        // Arrange
        Comment comment = new Comment("COMMENT");

        // Act
        String data = comment.getData();

        // Assert
        assertEquals("COMMENT", data);
    }
}

public class Comment {
    private String nodeName;
    private String data;

    public Comment(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}