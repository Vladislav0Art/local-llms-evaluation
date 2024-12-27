package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        String data = "Test data";
        Comment comment = new Comment(data);
        String expected = "<!--" + data + "-->";
        assertEquals(expected, comment.toString());
    }

}