package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewComment_nodeNameIsComment {

    @Test
    public void newComment_nodeNameIsComment() {
        Node comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}