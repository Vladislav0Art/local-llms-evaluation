package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedCreateCommentDataTest {

    @Test
    public void createCommentDataTest() {
        String data = "comment text";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}