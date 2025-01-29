package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("This is a test comment");
        comment.setData("This is the updated data");
        assertEquals("This is the updated data", comment.getData());
    }

}