package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        String expected = "<!--" + data + "-->";
        assertEquals(expected, comment.toString());
    }

}