package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedGetCommentValue_returnsCorrectString {

    @Test
    public void getCommentValue_returnsCorrectString() {
        Comment comment = new Comment("Hello, World!");
        assertEquals(comment.getData(), comment.getValue());
    }

}