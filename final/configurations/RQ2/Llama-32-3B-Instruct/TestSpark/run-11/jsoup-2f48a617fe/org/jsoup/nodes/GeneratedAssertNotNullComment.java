package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAssertNotNullComment {

    @Test
    public void assertNotNullComment() {
        Comment comment = new Comment();
        assertNotNull(comment);
    }
}

public class Comment {

    private String data;
    private String nodeName;

    public Comment() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getNodeName() {
        return nodeName;
    }

}