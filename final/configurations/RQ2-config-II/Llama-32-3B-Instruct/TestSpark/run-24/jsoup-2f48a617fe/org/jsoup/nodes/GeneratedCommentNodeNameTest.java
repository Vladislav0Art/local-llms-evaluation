package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCommentNodeNameTest {

    @Test
    public void commentNodeNameTest() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
        // assertion code here
    }

}