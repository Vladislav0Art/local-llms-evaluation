package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNewCommentHasData {

    @Test
    public void newCommentHasData() {
        String data = "test";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}