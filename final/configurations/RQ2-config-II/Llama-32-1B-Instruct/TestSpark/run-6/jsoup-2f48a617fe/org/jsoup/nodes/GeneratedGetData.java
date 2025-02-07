package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedGetData {

    @Test
    public void getData() {
        Comment comment = new Comment("Comment text");
        assertEquals("Comment text", comment.getData());
    }

}