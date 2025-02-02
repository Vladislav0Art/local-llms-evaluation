package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentSetData][EmptyStringData]

Test {

    @Test
    public void [CommentSetData][EmptyStringData]Test() throws IOException {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.setData("Hello");
        comment.outerHtmlHead(accum, depth, out);
        String expected = "<!--Hello-->";
        assertEquals(expected, accum.toString());
    }

}