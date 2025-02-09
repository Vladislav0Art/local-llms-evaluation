package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("test_data");
        assertEquals("<!--test_data-->", comment.toString());
    }

}