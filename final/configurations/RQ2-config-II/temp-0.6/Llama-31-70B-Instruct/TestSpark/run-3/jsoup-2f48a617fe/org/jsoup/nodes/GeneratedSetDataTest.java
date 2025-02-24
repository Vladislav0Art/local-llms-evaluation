package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() {
        String expected = "new data";
        String actual = new Comment("data").setData("new data").getData();
        assertEquals(expected, actual);
    }

}