package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedGetDataTest {

    @Test
    public void getDataTest() {
        Comment comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

}