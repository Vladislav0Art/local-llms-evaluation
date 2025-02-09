package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNewComment_GivenData_ReturnsCorrectData {

    @Test
    public void newComment_GivenData_ReturnsCorrectData() {
        String data = "This is a comment.";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}