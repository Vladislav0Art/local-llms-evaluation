package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeIterator;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNewComment_cloneIsSame {

    @Test
    public void newComment_cloneIsSame() {
        Node comment1 = new Comment("data");
        Node comment2 = comment1.clone();
        assertTrue(comment1 == comment2);
    }

}