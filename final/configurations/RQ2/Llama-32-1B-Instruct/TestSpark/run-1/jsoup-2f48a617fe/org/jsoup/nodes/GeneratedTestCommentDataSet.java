package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserDelegate;
import org.mockito.Mockito;

public class GeneratedTestCommentDataSet {

    @Test
    public void testCommentDataSet() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        comment.setData("data");
        assertEquals("data", comment.getData());
    }

}