package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class GeneratedGetDataReturnsCorrectValue {

    @Test
    public void getDataReturnsCorrectValue() {
        String data = "Some comment content";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}