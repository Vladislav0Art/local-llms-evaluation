package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedCreateCommentWithValidData_returnsNewComment {

    @Test
    public void createCommentWithValidData_returnsNewComment() {
        Comment comment = new Comment("Hello, World!");
        assertThat(comment, is(notNull()));
    }

}