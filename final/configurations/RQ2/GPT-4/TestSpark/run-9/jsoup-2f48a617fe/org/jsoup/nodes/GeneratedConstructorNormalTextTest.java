package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorNormalTextTest {

    @Test
    public void constructorNormalTextTest() {
        String testString = "Test string";
        Comment comment = new Comment(testString);
        assertEquals(testString, comment.getData());
    }

}