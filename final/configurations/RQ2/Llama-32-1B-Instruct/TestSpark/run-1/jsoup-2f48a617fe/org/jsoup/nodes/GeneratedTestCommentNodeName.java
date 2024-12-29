package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.ParserDelegate;
import org.mockito.Mockito;

public class GeneratedTestCommentNodeName {

    @Test
    public void testCommentNodeName() {
        String data = "<!-- comment -->";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

}