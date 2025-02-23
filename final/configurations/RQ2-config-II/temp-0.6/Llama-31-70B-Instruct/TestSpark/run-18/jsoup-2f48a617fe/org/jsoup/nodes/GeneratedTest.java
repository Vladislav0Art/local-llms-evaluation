package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void setDataTest() {
        Comment comment = new Comment("test");
        String data = "test data";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(true);
        out.outline(true);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--test-->", accum.toString());
    }

    @Test
    public void outerHtmlHeadWithoutPrettyPrintTest() throws IOException {
        Comment comment = new Comment("test");
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        out.prettyPrint(false);
        out.outline(false);
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--test-->", accum.toString());
    }

}