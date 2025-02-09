package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNewComment_GivenNoData_ReturnsEmptyString {

    @Test
    public void newComment_GivenNoData_ReturnsEmptyString() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}