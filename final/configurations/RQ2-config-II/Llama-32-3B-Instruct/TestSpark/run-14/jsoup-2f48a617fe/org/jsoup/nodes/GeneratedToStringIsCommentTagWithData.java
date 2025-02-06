package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedToStringIsCommentTagWithData {

    @Test
    public void toStringIsCommentTagWithData() {
        String data = "test";
        Comment comment = new Comment(data);
        assertTrue(comment.toString().contains("<comment>");
        assertTrue(comment.toString().contains("data=\""));
        assertTrue(comment.toString().contains("\""));
        assertEquals("test", comment.toString().split("\"")[1].trim());
    }

}