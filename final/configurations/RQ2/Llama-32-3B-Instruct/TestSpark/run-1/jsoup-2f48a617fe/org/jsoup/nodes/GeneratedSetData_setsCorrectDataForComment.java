package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedSetData_setsCorrectDataForComment {

    @Test
    public void setData_setsCorrectDataForComment() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

}