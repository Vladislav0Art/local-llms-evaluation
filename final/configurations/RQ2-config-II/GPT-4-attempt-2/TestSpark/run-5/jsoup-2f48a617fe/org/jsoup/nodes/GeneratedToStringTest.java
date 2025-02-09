package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String data = "testdata";
        Comment comment = new Comment(data);
        assertTrue(comment.toString().contains(data));
    }

}