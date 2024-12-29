package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.io.ByteArrayOutputStream;

public class GeneratedToString_returnsCorrectStringRepresentation {

    @Test
    public void toString_returnsCorrectStringRepresentation() {
        Comment comment = new Comment("");
        assertTrue(comment.toString().contains("-->"));
    }

}