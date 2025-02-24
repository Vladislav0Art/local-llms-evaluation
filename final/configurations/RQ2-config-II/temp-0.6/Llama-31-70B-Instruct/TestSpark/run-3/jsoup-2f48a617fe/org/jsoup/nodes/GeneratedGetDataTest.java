package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        String expected = "data";
        String actual = new Comment("data").getData();
        assertEquals(expected, actual);
    }

}