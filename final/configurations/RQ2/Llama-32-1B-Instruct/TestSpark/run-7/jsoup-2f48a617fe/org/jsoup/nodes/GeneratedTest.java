package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void [Comment][NodeName]

    Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("<!--", comment.nodeName());
        assertEquals("sample-comment", comment.getData());
        assertEquals("This is a sample comment", comment.getData());
    }

    @Test
    public void [Comment][Data]

    Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("data", comment.getData());
    }

    @Test
    public void [Comment][Setter]

    Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("isXmlDeclaration", comment.isXmlDeclaration());
        assertEquals(null, comment.asXmlDeclaration());
    }

    @Test
    public void [Comment][ToString]

    Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals("This is a sample comment", comment.toString());
    }

    @Test
    public void [Comment][Clone]

    Test() throws IOException {
        String data = "<!-- This is a sample comment -->";
        Comment comment = new Comment(data);
        assertEquals(comment, comment.clone());
    }

}