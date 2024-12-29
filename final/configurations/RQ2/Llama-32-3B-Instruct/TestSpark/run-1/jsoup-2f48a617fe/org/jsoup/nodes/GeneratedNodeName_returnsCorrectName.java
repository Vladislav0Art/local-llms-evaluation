package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeName_returnsCorrectName {

    @Test
    public void nodeName_returnsCorrectName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}