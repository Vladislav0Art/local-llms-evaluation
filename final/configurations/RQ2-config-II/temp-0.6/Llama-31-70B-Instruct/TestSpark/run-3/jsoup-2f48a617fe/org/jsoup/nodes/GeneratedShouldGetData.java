package org.jsoup.nodes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

public class GeneratedShouldGetData {

    @Test
    public void shouldGetData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

}