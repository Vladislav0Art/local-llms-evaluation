package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String expected = "Comment[comment]";
        String actual = new Comment("comment").toString();
        assertEquals(expected, actual);
    }

}