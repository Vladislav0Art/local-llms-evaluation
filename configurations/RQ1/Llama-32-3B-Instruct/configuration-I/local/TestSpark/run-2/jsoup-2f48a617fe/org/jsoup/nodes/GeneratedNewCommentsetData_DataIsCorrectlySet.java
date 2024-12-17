package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

public class GeneratedNewCommentsetData_DataIsCorrectlySet {

    @Test
    public void newCommentsetData_DataIsCorrectlySet() throws IOException {
        Comment comment = new Comment("");
        comment.setData("This is a comment");
        assertEquals("This is a comment", comment.getData());
    }

}