package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedNodeName_WhenCalled_ReturnsExpectedValue {

    @Test
    public void nodeName_WhenCalled_ReturnsExpectedValue() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeName());
    }

}