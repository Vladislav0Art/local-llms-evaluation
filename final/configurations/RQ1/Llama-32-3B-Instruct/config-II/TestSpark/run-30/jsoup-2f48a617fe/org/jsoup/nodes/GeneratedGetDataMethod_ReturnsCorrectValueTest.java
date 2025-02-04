package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetDataMethod_ReturnsCorrectValueTest {

    @Test
    public void getDataMethod_ReturnsCorrectValueTest() {
        Comment comment = new Comment("This is a test");
        assertEquals(comment.getData(), "This is a test");
    }

}