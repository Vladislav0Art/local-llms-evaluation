package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedClone {

    @Test
    public void clone() {
        Comment comment = new Comment("Comment text");
        Comment clonedComment = comment.clone();
        assertTrue(comment == clonedComment);
    }

}