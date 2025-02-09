package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedNodeName_comment_returnsName {

    @Test
    public void nodeName_comment_returnsName() {
        Comment comment = new Comment("data");
        assertEquals("comment", comment.nodeName());
    }

}