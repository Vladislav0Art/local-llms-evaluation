package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Generated[Comment][Data]

Test {

    @Test
    public void [Comment][Data]Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("data", comment.getData());
    }

}