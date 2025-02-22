package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSetDataTest {

    @Test
    public void setDataTest() throws IOException {
        Comment comment = new Comment("Data");
        comment.setData("New Data");
        String actualData = comment.getData();
        assertEquals("New Data", actualData);
    }

}