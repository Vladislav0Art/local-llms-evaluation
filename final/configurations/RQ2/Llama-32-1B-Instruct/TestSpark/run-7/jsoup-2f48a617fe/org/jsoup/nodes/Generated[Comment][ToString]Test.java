package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Generated[Comment][ToString]

Test {

    @Test
    public void [Comment][ToString]Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("This is a sample comment", comment.toString());
    }

}