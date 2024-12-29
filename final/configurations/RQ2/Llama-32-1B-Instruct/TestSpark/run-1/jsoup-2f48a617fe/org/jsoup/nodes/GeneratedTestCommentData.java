package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserDelegate;
import org.mockito.Mockito;

public class GeneratedTestCommentData {

    @Test
    public void testCommentData() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.getData());
    }

}