package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getDataTest() throws IOException {
        Comment comment = new Comment("Data");
        String actualData = comment.getData();
        assertEquals("Data", actualData);
    }

    @Test
    public void setDataTest() throws IOException {
        Comment comment = new Comment("Data");
        comment.setData("New Data");
        String actualData = comment.getData();
        assertEquals("New Data", actualData);
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Data");
        String expectedHtml = "<!--Data-->";
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        String actualHtml = accum.toString();
        assertEquals(expectedHtml, actualHtml);
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("Data");
        String expectedHtml = "";
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        String actualHtml = accum.toString();
        assertEquals(expectedHtml, actualHtml);
    }

    @Test
    public void toStringTest() throws IOException {
        Comment comment = new Comment("Data");
        String expectedString = "<!--Data-->";
        String actualString = comment.toString();
        assertEquals(expectedString, actualString);
    }

    @Test
    public void cloneTest() throws IOException {
        Comment comment = new Comment("Data");
        Comment clonedComment = (Comment) comment.clone();
        assertEquals(comment, clonedComment);
    }

}