package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedGetData_returnsDataOfComment {

    @Test
    public void getData_returnsDataOfComment() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

}