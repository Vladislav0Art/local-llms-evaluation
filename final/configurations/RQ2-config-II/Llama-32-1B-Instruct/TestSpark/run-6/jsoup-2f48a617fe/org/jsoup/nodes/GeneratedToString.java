package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedToString {

    @Test
    public void toString() {
        Comment comment = new Comment("Comment text");
        String expected = "<Comment>Comment text</Comment>";
        assertEquals(expected, comment.toString());
    }

}