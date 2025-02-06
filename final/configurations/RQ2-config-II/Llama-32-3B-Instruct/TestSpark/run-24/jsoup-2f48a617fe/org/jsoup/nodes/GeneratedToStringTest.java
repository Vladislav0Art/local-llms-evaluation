package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("data");
        String actualOutput = comment.toString();
        assertEquals("<!-- data -->", actualOutput);
        // assertion code here
    }

}