package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNodeName_ReturnsExpectedString {

    @Test
    public void nodeName_ReturnsExpectedString() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}