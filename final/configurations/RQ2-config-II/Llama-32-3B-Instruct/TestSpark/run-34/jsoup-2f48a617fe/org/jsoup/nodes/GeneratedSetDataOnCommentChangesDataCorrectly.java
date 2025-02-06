package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedSetDataOnCommentChangesDataCorrectly {

    @Test
    public void setDataOnCommentChangesDataCorrectly() {
        Comment comment = new Comment("");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}