package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Generated[Comment][NodeName]

Test {

    @Test
    public void [Comment][NodeName]Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("<!--", comment.nodeName());
        assertEquals("sample-comment", comment.getData());
        assertEquals("This is a sample comment", comment.getData());
    }

}