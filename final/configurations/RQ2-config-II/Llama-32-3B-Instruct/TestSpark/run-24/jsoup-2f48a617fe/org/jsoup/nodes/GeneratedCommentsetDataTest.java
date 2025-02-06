package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCommentsetDataTest {

    @Test
    public void commentsetDataTest() {
        Comment comment = new Comment("");
        comment.setData("Hello World");
        assertEquals("Hello World", comment.getData());
        // assertion code here
    }

}