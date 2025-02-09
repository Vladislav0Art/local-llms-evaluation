package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Comment comment = new Comment("test comment");
        assertEquals("#comment", comment.nodeName());
    }

}