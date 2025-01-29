package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class Generated[Comment][Setter]

Test {

    @Test
    public void [Comment][Setter]Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("isXmlDeclaration", comment.isXmlDeclaration());
        assertEquals(null, comment.asXmlDeclaration());
    }

}