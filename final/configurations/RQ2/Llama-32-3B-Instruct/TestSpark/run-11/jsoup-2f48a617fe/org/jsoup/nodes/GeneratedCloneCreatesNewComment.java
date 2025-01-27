package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.mockito.Mockito;

public class GeneratedCloneCreatesNewComment {

    @Test
    public void cloneCreatesNewComment() {
        String data = "test";
        Comment comment1 = new Comment(data);
        Comment comment2 = comment1.clone();
        assertNotNull(comment2);
        assertEquals(data, comment2.getData());
    }

}