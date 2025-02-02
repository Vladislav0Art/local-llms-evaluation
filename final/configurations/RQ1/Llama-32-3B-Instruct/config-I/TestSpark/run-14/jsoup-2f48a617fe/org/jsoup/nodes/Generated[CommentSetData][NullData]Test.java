package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class Generated[CommentSetData][NullData]

Test {

    @Test
    public void [CommentSetData][NullData]Test() throws IOException {
        Document doc = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.setData(null);
        assertEquals("", accum.toString());
    }

}