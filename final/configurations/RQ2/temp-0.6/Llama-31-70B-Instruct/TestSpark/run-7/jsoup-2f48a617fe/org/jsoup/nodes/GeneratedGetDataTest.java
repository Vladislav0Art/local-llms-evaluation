package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}