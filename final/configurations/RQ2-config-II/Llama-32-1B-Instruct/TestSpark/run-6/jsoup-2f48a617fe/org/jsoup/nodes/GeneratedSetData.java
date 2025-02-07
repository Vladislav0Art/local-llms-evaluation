package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;

public class GeneratedSetData {

    @Test
    public void setData() {
        Comment comment = new Comment("Comment text");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}