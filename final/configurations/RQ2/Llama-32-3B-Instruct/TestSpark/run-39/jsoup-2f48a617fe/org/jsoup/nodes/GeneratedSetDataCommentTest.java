package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedSetDataCommentTest {

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

}