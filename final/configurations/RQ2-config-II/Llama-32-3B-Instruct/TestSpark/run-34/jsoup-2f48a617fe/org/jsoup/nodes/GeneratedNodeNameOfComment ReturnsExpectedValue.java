package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Appendable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameOfComment ReturnsExpectedValue {

    @Test
    public void nodeNameOfComment

    ReturnsExpectedValue() {
        Comment comment = new Comment("Hello World");
        assertEquals("COMMENT", comment.nodeName());
    }

}