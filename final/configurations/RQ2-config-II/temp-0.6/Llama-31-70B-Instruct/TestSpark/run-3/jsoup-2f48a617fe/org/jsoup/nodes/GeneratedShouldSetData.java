package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedShouldSetData {

    @Test
    public void shouldSetData() {
        Comment comment = new Comment("Hello World");
        comment.setData("Hello Universe");
        assertEquals("Hello Universe", comment.getData());
    }

}