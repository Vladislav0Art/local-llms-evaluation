package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewComment_dataIsEmpty {

    @Test
    public void newComment_dataIsEmpty() {
        Node comment = new Comment("");
        assertTrue(comment.getData().isEmpty());
    }

}