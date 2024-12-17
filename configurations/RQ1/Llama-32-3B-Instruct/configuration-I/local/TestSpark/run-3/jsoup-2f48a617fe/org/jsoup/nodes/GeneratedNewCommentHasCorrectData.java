package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;

public class GeneratedNewCommentHasCorrectData {

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment("Hello World!");
        assertEquals("Hello World!", comment.getData());
    }

}