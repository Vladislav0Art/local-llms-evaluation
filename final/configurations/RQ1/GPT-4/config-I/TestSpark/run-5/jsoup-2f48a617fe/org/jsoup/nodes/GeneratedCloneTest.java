package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        String data = "Sample Comment";
        Comment comment = new Comment(data);
        Comment clone = comment.clone();

        assertEquals(comment.getData(), clone.getData());
        assertNotSame(comment, clone);
    }

}