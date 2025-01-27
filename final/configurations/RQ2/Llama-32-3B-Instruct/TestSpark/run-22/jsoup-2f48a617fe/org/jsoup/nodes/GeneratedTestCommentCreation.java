package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestCommentCreation {

    @Test
    public void testCommentCreation() {
        Comment comment = new Comment("<!-- This is a comment -->");
        assertThat(comment.data(), is("<!-- This is a comment -->"));
    }

}