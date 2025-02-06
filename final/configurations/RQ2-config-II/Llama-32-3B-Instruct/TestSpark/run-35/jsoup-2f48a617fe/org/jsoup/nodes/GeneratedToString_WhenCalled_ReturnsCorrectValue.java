package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedToString_WhenCalled_ReturnsCorrectValue {

    @Test
    public void toString_WhenCalled_ReturnsCorrectValue() {
        Comment comment = new Comment("");
        assertEquals("", comment.toString());
    }

}