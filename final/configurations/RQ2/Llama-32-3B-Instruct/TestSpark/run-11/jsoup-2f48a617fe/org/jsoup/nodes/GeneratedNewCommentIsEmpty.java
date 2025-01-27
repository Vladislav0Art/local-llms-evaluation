package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNewCommentIsEmpty {

    @Test
    public void newCommentIsEmpty() {
        String data = "";
        Comment comment = new Comment(data);
        assertEquals("", comment.getData());
    }

}