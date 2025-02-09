package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedNewComment_isNotNull {

    @Test
    public void newComment_isNotNull() {
        Comment comment = new Comment("data");
        assertNotNull(comment);
    }

}