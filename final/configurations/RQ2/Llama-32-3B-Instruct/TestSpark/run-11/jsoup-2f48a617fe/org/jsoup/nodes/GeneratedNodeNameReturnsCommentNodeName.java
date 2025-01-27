package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedNodeNameReturnsCommentNodeName {

    @Test
    public void nodeNameReturnsCommentNodeName() {
        Comment comment = new Comment("test");
        assertEquals("comment", comment.nodeName());
    }

}